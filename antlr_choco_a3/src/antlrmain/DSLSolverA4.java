package antlrmain;

import choco.Choco;
import choco.Options;
import choco.kernel.model.constraints.Constraint;
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

            CommonTree plus = (CommonTree) child;
            List<CommonTree> blockTrees = (List<CommonTree>) plus.getChildren();

            System.out.println("Plus: " + plus.toStringTree());

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

            Map<Character, IntegerVariable> intVars = new HashMap<>();

            // Declare every letter as a variable
            //IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
            for (List<Character> chars : blocks) {
                for (Character c : chars) {
                    if (c.equals(DUMMY_CHAR)) {
                        intVars.put(c, Choco.makeIntVar(c.toString(), 0, 0, Options.V_ENUM));
                    } else {
                        intVars.put(c, Choco.makeIntVar(c.toString(), 0, 9, Options.V_ENUM));
                    }
                }
            }

            // declare carry constraints
            IntegerVariable c0 = Choco.makeIntVar("c0", 0, 0, Options.V_ENUM);
            IntegerVariable c1 = Choco.makeIntVar("c1", 0, 1, Options.V_ENUM);
            IntegerVariable c2 = Choco.makeIntVar("c2", 0, 1, Options.V_ENUM);
            IntegerVariable c3 = Choco.makeIntVar("c3", 0, 1, Options.V_ENUM);
            IntegerVariable c4 = Choco.makeIntVar("c4", 0, 1, Options.V_ENUM);
            IntegerVariable c5 = Choco.makeIntVar("c5", 0, 1, Options.V_ENUM);
            IntegerVariable c6 = Choco.makeIntVar("c6", 0, 0, Options.V_ENUM);

            // wir haben EINEN carry constraint mehr als es buchstaben gibt
            Map<String, IntegerVariable> carries = new HashMap<>();
            for (int i = 0; i - 1 < blocks.get(0).size(); i++) {
                String carry = "c" + i;
                if (i == 0 || i == blocks.get(0).size()) {
                    carries.put(carry, Choco.makeIntVar(carry, 0, 0, Options.V_ENUM));
                } else {
                    carries.put(carry, Choco.makeIntVar(carry, 0, 1, Options.V_ENUM));
                }
            }
            // das allererste und allerletzte Carry sind null.
            System.out.println(carries.toString());
/*





            IntegerVariable donald = Choco.makeIntVar("donald", 0, 1000000, Options.V_BOUND);
            IntegerVariable gerald = Choco.makeIntVar("gerald", 0, 1000000, Options.V_BOUND);

            IntegerVariable robert = Choco.makeIntVar("robert", 0, 1000000, Options.V_BOUND);


            int[] c = new int[]{100000, 10000, 1000, 100, 10, 1};

            // Declare every combination of letter as an integer expression
            IntegerExpressionVariable donaldLetters = Choco.scalar(new IntegerVariable[]{d, o, n, a,
                    l, d}, c);
            IntegerExpressionVariable geraldLetters = Choco.scalar(new IntegerVariable[]{g, e, r, a,
                    l, d}, c);
            IntegerExpressionVariable robertLetters = Choco.scalar(new IntegerVariable[]{r, o, b, e,
                    r, t}, c);
            // Add equality between name and letters combination


            model.addConstraint(Choco.eq(donaldLetters, donald));
            model.addConstraint(Choco.eq(geraldLetters, gerald));
            model.addConstraint(Choco.eq(robertLetters, robert));


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
