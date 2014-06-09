package antlrmain;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import org.antlr.runtime.tree.CommonTree;

import java.util.*;

/**
 * Created by kbrusch on 6/7/14.
 */
public class DSLSolverA4 {

    private static final Character DUMMY_CHAR = new Character('_');

    public static void solveFromTree(CommonTree tree) {

        // get the List of Chars in the puzzle
        Set<Character> charSet = findAllChars(tree);
        assert charSet.size() <= 10;

        // set of chars with the Dummy Char
        Set<Character> charSetDummy = new HashSet<>(charSet);
        charSetDummy.add(DUMMY_CHAR);

        Map<Character, IntegerVariable> globalCharIntVars = fromCharSet(charSetDummy);

        // Für jedes PlusConds, mache:
        List<PlusCond> conds = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            List<List<Character>> blocks = fromTree(child);

            // declare carry constraints
            Map<String, IntegerVariable> carries = mkCarriesIntVars(blocks);

            // first character in block should be greater than zero
            List<Constraint> firstCharGT0 = mkFstCharConstraints(blocks, globalCharIntVars);

            // store the constraints
            conds.add(new PlusCond(blocks, globalCharIntVars, carries, firstCharGT0));
        }

        // for each plusCond. Calculate the Constraints for the Columns
        for(PlusCond plusCond:conds) {

            List<Constraint> columnConstraints = new ArrayList<>();

            // for each column
            for(int col = 0; col < plusCond.getWordLength(); col++) {
                IntegerVariable letterA = plusCond.getCharVarAt(0,col);
                IntegerVariable letterB = plusCond.getCharVarAt(1,col);
                IntegerVariable resultLetter = plusCond.getCharVarAt(2,col);

                IntegerVariable currentCarry = plusCond.getCarryAt(col);
                IntegerVariable nextCarry = plusCond.getCarryAt(col + 1);

                /*IntegerExpressionVariable one_4 = Choco.plus(Choco.plus(n, r), c3);
                IntegerExpressionVariable two_4 = Choco.plus(b, Choco.mult(c4, constant));

                model.addConstraint(Choco.eq(one_4, two_4));*/

                IntegerExpressionVariable upperSide =
                        Choco.plus(Choco.plus(letterA,letterB), currentCarry);

                IntegerExpressionVariable bottomSide =
                        Choco.plus(resultLetter, Choco.mult(nextCarry, 10));

                columnConstraints.add(Choco.eq(upperSide, bottomSide));
            }

            plusCond.setColumnConstraints(columnConstraints);

            // System.out.println("Column: " + columnConstraints);

        }

        System.out.println("CharSet (without Dummy): " + charSet);
        // System.out.println("CharSet w/Dummy: " + charSetDummy);


        // außerdem wird hier auch noch "all different" ausgeführt
        Constraint allDiff = allDifferentConstraints(charSet, globalCharIntVars);
        // dont include dummy char in allDifferent constraint


        // add all accumulated Constraints
        Model model = new CPModel();
        for(PlusCond p:conds) {
            for(Constraint c:p.getAllConstraints()) {
                model.addConstraint(c);
            }
        }
        model.addConstraint(allDiff);


        // Solve
        Solver s = new CPSolver();
        s.read(model);
        s.solveAll();

        // prepare Solutions
        Map<Character, Integer> mappings = new HashMap<>();
        Map<Integer, Character> reverseMappings = new HashMap<>();
        List<Integer> ints = new ArrayList<>();
        for(Character c:charSet) {
            Integer i = s.getVar(globalCharIntVars.get(c)).getVal();
            mappings.put(c, i);
            reverseMappings.put(i, c);
            ints.add(i);
        }
        Collections.sort(ints);

        // print Solutions in ascending order
        for(Integer i:ints) {
            Character c = reverseMappings.get(i);
            System.out.println(c  + " => " + i);
        }
    }

    // creates InteverVariables for the given Characters. The dummy char has to be zero.
    private static Map<Character, IntegerVariable> fromCharSet(Set<Character> charSetDummy) {
        Map<Character, IntegerVariable> vars = new HashMap<>();
        for(Character c:charSetDummy) {
            if (c.equals(DUMMY_CHAR)) {
                vars.put(c, Choco.makeIntVar(c.toString(), 0, 0, Options.V_ENUM));
            } else {
                vars.put(c, Choco.makeIntVar(c.toString(), 0, 9, Options.V_ENUM));
            }
        }
        return vars;
    }

    // returns all the true characters occuring in the puzzle
    private static Set<Character> findAllChars(CommonTree tree) {
        Set<Character> charSet = new HashSet<>();
        for (Object child : tree.getChildren()) {
            List<List<Character>> blocks = fromTree(child);
            for(List<Character> chars:blocks) {
                for(Character c:chars) {
                    if(!c.equals(DUMMY_CHAR))   // dont add the dummy char
                        charSet.add(c);
                }
            }
        }
        return charSet;
    }
    // creates the all different constraint, if given the charSet of the Puzzle and its IntegerVariables
    private static Constraint allDifferentConstraints(Set<Character> charSet, Map<Character,IntegerVariable> charIntVars) {
        Set<IntegerVariable> intVars = new HashSet<>();
        for (Character c:charSet) {
            intVars.add(charIntVars.get(c));
        }
        //model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));

        // https://stackoverflow.com/questions/9863742/trying-to-pass-an-arraylist-to-a-varargs-method
        Constraint allDiff = Choco.allDifferent(intVars.toArray(new IntegerVariable[intVars.size()]));

        // System.out.println("AllDiff: " + allDiff);
        return allDiff;
    }

    // creates the Constraints, that the first character in each block/word must not be zero.
    private static List<Constraint> mkFstCharConstraints(List<List<Character>> blocks,Map<Character, IntegerVariable> charsIntVars) {
        List<Constraint> ls = new ArrayList<>();

        for(List<Character> chars:blocks) {
            ls.add(firstCharIsGT0(chars, charsIntVars));
        }
        // System.out.println("GT 0 Constraints: " + ls);
        return ls;
    }

    // creates the constraint for a given block
    private static Constraint firstCharIsGT0(List<Character> chars, Map<Character, IntegerVariable> charsIntVars) {
        for(Character c:chars) {
            // der erste non-dummy character muss größer as 0 sein.
            if(c.equals(DUMMY_CHAR)) continue;
            // model.addConstraint(Choco.gt(d, 0));
            return Choco.gt(charsIntVars.get(c), 0);
        }
        new RuntimeException("Charslist only contains DUMMYs: " + chars);
        return null;
    }

    // builds the blocks if given the PlusCond from ANTLR AST. It also normalizses the lengths,
    // so that every block has the same length. It prepends dummy characters, if the length is too small.
    private static List<List<Character>> fromTree(Object child) {
        CommonTree plus = (CommonTree) child;
        List<CommonTree> blockTrees = (List<CommonTree>) plus.getChildren();

        // System.out.println("Plus: " + plus.toStringTree());

        List<List<Character>> blocks_unnormalized = new ArrayList<>();
        for (CommonTree block : blockTrees) {
            List<Character> chars = new ArrayList<>();
            for (Object _char : block.getChildren()) {
                chars.add(((CommonTree) _char).getText().charAt(0));
            }
            blocks_unnormalized.add(chars);
        }
        List<List<Character>> blocks = normalizeLengths(blocks_unnormalized);

        // System.out.println("Blocks: " + blocks);

        return blocks;
    }

    // gegeben den Blöcken, werden daraus die IntVars für die Carries erzeugt.
    private static Map<String, IntegerVariable> mkCarriesIntVars(List<List<Character>> blocks) {
        // wir haben EINEN carry constraint mehr als es buchstaben gibt
        Map<String, IntegerVariable> carries = new HashMap<>();
        for (int i = 0; i - 1 < blocks.get(0).size(); i++) {
            String carry = "c" + i;
            // das allererste und allerletzte Carry sind null.
            if (i == 0 || i == blocks.get(0).size()) {
                carries.put(carry, Choco.makeIntVar(carry, 0, 0, Options.V_ENUM));
            } else {
                // IntegerVariable c0 = Choco.makeIntVar("c0", 0, 0, Options.V_ENUM);
                carries.put(carry, Choco.makeIntVar(carry, 0, 1, Options.V_ENUM));
            }
        }
        // System.out.println("Carries: " + carries.toString());
        return carries;
    }

    private static List<List<Character>> normalizeLengths(List<List<Character>> blocks) {
        List<List<Character>> blocks_ret = new ArrayList<>();

        int maxLength = 0;
        for (List<Character> chars : blocks) {
            maxLength = Math.max(maxLength, chars.size());
        }

        // prepend dummy Characters
        for (List<Character> chars : blocks) {
            int missing = maxLength - chars.size();
            List<Character> fixedSize = new ArrayList<>(chars);
            Collections.reverse(fixedSize);
            for (int i = 0; i < missing; i++) {
                fixedSize.add(DUMMY_CHAR);
            }
            Collections.reverse(fixedSize);
            blocks_ret.add(fixedSize);
        }

        return blocks_ret;
    }

}
