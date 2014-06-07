package antlrmain;

import choco.Choco;
import choco.Options;
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

    public static Solver solveFromTree(CommonTree tree) {

        List<Constraint> conds = toConstraints(tree);

        return mkModel(conds);

    }

    private static final Character DUMMY_CHAR = new Character('_');

    private static Solver mkModel(List<Constraint> conds) {
        // T O DD O
        return null;
    }

    public static List<Constraint> toConstraints(CommonTree tree) {

        List<Constraint> constraints = new ArrayList<>();

        for (Object child : tree.getChildren()) {

            List<List<Character>> blocks = fromTree(child);

            Map<Character, IntegerVariable> charsIntVars = mkCharsIntVars(blocks);

            // declare carry constraints
            Map<String, IntegerVariable> carries = mkCarriesIntVars(blocks);

            List<Constraint> blockWordsConstraints = mkWordConstraints(blocks,charsIntVars);

/*
            // Constant of coefficients
            int constant = 10;

            model.addConstraint(Choco.gt(d, 0));
            model.addConstraint(Choco.gt(g, 0));
            model.addConstraint(Choco.gt(r, 0));

            IntegerExpressionVariable one_1 = Choco.plus(Choco.plus(d, d), c0);
            IntegerExpressionVariable two_1 = Choco.plus(t, Choco.mult(c1, constant));

            constraints.add(Choco.eq(one_1, two_1));
            */
        }


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

        // System.out.println(carries.toString());
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
