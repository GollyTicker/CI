package antlrmain;

import choco.Choco;
import choco.Options;
import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;
import com.sun.tools.javac.util.Pair;
import org.antlr.runtime.tree.CommonTree;

import java.util.*;

/**
 * Created by kbrusch on 6/7/14.
 */
public class DSLSolverA4 {

    private static final Character DUMMY_CHAR = new Character('_');

    public static Solver solveFromTree(CommonTree tree) {

        // Für jedes PlusConds, mache:
        List<PlusCond> conds = new ArrayList<>();
        for (Object child : tree.getChildren()) {
            List<List<Character>> blocks = fromTree(child);

            Map<Character, IntegerVariable> charsIntVars = mkCharsIntVars(blocks);

            // declare carry constraints
            Map<String, IntegerVariable> carries = mkCarriesIntVars(blocks);

            List<Constraint> blockWordsConstraints = mkWordConstraints(blocks,charsIntVars);


            List<Constraint> firstCharGT0 = mkFstCharConstraints(blocks, charsIntVars);
            conds.add(new PlusCond(blocks, charsIntVars, carries, blockWordsConstraints, firstCharGT0));
        }

        // Constant of coefficients
        final int ten = 10;

        // for each plusCond. Calculate the Constraints for the Columns
        for(int plusCondIdx = 0; plusCondIdx < conds.size(); plusCondIdx++) {
            PlusCond plusCond = conds.get(plusCondIdx);
            // for each column
            List<Constraint> columnConstraints = new ArrayList<>();
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
                        Choco.plus(resultLetter, Choco.mult(nextCarry, ten));

                columnConstraints.add(Choco.eq(upperSide, bottomSide));
            }

            plusCond.setColumnConstraints(columnConstraints);

            // System.out.println("Column: " + columnConstraints);

        }


        // TODO: sicherstellen, dass die charIntVars von den unterschiedlichen PlusCods
        // einander gleich sind -> neue Constraints
        List<Constraint> unifyingConstraints = unifyCharConstraints(conds);


/*
            // all different
            model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));

            Solver s = new CPSolver();
            s.read(model);
            s.solveAll();
            // Print name value

           // System.out.println(s.pretty());
            // Print name value
            // System.out.println("get domain for donald" + s.getVar(donald).getDomain());
    //        System.out.println("donald␣=␣" + s.getVar(donald).getVal());
            */


        return null;
    }

    private static List<Constraint> unifyCharConstraints(List<PlusCond> conds) {

        List<Constraint> unifyingConstraints = new ArrayList<>();

        // find all Characters
        Set<Character> charSet = null;
        // find intVars for each Character (charIntVars)
        Map<Character,Set<IntegerVariable>> charIntVarsSet = null;

        // unify all Constraints for each Character
        for(Map.Entry<Character,Set<IntegerVariable>> entry:charIntVarsSet.entrySet()) {
            Character c = entry.getKey();
            Set<IntegerVariable> intVars = entry.getValue();
            IntegerVariable fstVar = getFirst(intVars);
            for(IntegerVariable intVar:intVars) {
                unifyingConstraints.add(Choco.eq(fstVar, intVar));
            }
        }

        return unifyingConstraints;
    }

    private static IntegerVariable getFirst(Set<IntegerVariable intVars) {
        for(IntegerVariable intVar:intVars) {
            return intVar;
        }
        throw new RuntimeException("Set<IntegerVariable> for a Char shouldnt be empty");
        return null;
    }

    private static List<Constraint> mkFstCharConstraints(List<List<Character>> blocks,Map<Character, IntegerVariable> charsIntVars) {
        List<Constraint> ls = new ArrayList<>();

        for(List<Character> chars:blocks) {
            ls.add(firstCharIsGT0(chars, charsIntVars));
        }
        System.out.println("GT 0 Constraints: " + ls);
        return ls;
    }

    private static Constraint firstCharIsGT0(List<Character> chars, Map<Character, IntegerVariable> charsIntVars) {
        for(Character c:chars) {
            // der erste non-dummy character muss größer as 0 sein.
            if(c.equals(DUMMY_CHAR)) continue;
            // model.addConstraint(Choco.gt(d, 0));
            return Choco.eq(charsIntVars.get(c), 0);
        }
        new RuntimeException("Charslist only contains DUMMYs: " + chars);
        return null;
    }

    private static List<Constraint> mkWordConstraints(List<List<Character>> blocks, Map<Character, IntegerVariable> charsIntVars) {
        // Wörter zusammenfassen zum einfacheren Anzeigen
        List<Constraint> blockWordsConstraints = new ArrayList<>();
        for (List<Character> chars:blocks) {

            // IntegerVariable gerald = Choco.makeIntVar("gerald", 0, 1000000, Options.V_BOUND);
            int upperBound = (int)Math.round(Math.pow(10,chars.size()));
            IntegerVariable blockWord = Choco.makeIntVar(prettyString(chars), 0, upperBound, Options.V_BOUND);

            // int[] c = new int[]{100000, 10000, 1000, 100, 10, 1};
            int[] constants = new int[chars.size()];
            for(int i = 0; i < constants.length ;i++) {
                // absteigende zehnerpotenzen bis runter zu 1
                constants[i] = (int)Math.round(Math.pow(10,constants.length - 1 - i));
            }

            IntegerVariable[] intVarArr = new IntegerVariable[chars.size()];
            int i = 0;
            for(Character c:chars) {
                intVarArr[i] = charsIntVars.get(c);
                i++;
            }

            // Declare every combination of letter as an integer expression
            // IntegerExpressionVariable donaldLetters = Choco.scalar(new IntegerVariable[]{d, o, n, a,
            //        l, d}, c);
            IntegerExpressionVariable wordLetters = Choco.scalar( intVarArr, constants);

            // Add equality between name and letters combination
            // model.addConstraint(Choco.eq(donaldLetters, donald));
            blockWordsConstraints.add(Choco.eq(wordLetters, blockWord));
        }

        // System.out.println("Words: " + blockWordsConstraints);
        return blockWordsConstraints;
    }

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

        System.out.println(blocks);

        return blocks;
    }

    private static Map<Character, IntegerVariable> mkCharsIntVars(List<List<Character>> blocks) {
        Map<Character, IntegerVariable> charsIntVars = new HashMap<>();

        // Declare every letter as a variable
        //IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
        for (List<Character> chars : blocks) {
            for (Character c : chars) {
                if (c.equals(DUMMY_CHAR)) {
                    charsIntVars.put(c, Choco.makeIntVar(c.toString(), 0, 0, Options.V_ENUM));
                } else {
                    charsIntVars.put(c, Choco.makeIntVar(c.toString(), 0, 9, Options.V_ENUM));
                }
            }
        }
        return charsIntVars;
    }

    private static Map<String, IntegerVariable> mkCarriesIntVars(List<List<Character>> blocks) {
        // IntegerVariable c0 = Choco.makeIntVar("c0", 0, 0, Options.V_ENUM);
        // wir haben EINEN carry constraint mehr als es buchstaben gibt
        Map<String, IntegerVariable> carries = new HashMap<>();
        for (int i = 0; i - 1 < blocks.get(0).size(); i++) {
            String carry = "c" + i;
            // das allererste und allerletzte Carry sind null.
            if (i == 0 || i == blocks.get(0).size()) {
                carries.put(carry, Choco.makeIntVar(carry, 0, 0, Options.V_ENUM));
            } else {
                carries.put(carry, Choco.makeIntVar(carry, 0, 1, Options.V_ENUM));
            }
        }

        System.out.println(carries.toString());
        return carries;
    }

    private static String prettyString(List<Character> chars) {
        StringBuilder sb = new StringBuilder();
        for(Character c:chars) {
            sb.append(c.toString());
        }
        return String.valueOf(sb);
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
