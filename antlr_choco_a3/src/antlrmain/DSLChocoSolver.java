package antlrmain;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

/**
 * Created by kbrusch on 5/17/14.
 */

public class DSLChocoSolver {


    public static void main(String[] args) throws Exception {
        long t1 = System.currentTimeMillis();
        //for (int i = 0; i < 10000; i++)
            solveWithMethod();
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);
    }


    private static void solveWithMethod() {
        //Build new Choco Model
        Model model = new CPModel();

        // Declare every letter as a variable
        IntegerVariable d = Choco.makeIntVar("d", 0, 9, Options.V_ENUM);
        IntegerVariable o = Choco.makeIntVar("o", 0, 9, Options.V_ENUM);
        IntegerVariable n = Choco.makeIntVar("n", 0, 9, Options.V_ENUM);
        IntegerVariable a = Choco.makeIntVar("a", 0, 9, Options.V_ENUM);
        IntegerVariable l = Choco.makeIntVar("l", 0, 9, Options.V_ENUM);
        IntegerVariable g = Choco.makeIntVar("g", 0, 9, Options.V_ENUM);
        IntegerVariable e = Choco.makeIntVar("e", 0, 9, Options.V_ENUM);
        IntegerVariable r = Choco.makeIntVar("r", 0, 9, Options.V_ENUM);

        IntegerVariable b = Choco.makeIntVar("b", 0, 9, Options.V_ENUM);
        IntegerVariable t = Choco.makeIntVar("t", 0, 9, Options.V_ENUM);

        // declare carry constraints
        IntegerVariable c0 = Choco.makeIntVar("c0", 0, 0, Options.V_ENUM);
        IntegerVariable c1 = Choco.makeIntVar("c1", 0, 1, Options.V_ENUM);
        IntegerVariable c2 = Choco.makeIntVar("c2", 0, 1, Options.V_ENUM);
        IntegerVariable c3 = Choco.makeIntVar("c3", 0, 1, Options.V_ENUM);
        IntegerVariable c4 = Choco.makeIntVar("c4", 0, 1, Options.V_ENUM);
        IntegerVariable c5 = Choco.makeIntVar("c5", 0, 1, Options.V_ENUM);
        IntegerVariable c6 = Choco.makeIntVar("c6", 0, 0, Options.V_ENUM);


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
        model.addConstraint(Choco.eq(one_1, two_1));

        IntegerExpressionVariable one_2 = Choco.plus(Choco.plus(l, l), c1);
        IntegerExpressionVariable two_2 = Choco.plus(r, Choco.mult(c2, constant));
        model.addConstraint(Choco.eq(one_2, two_2));

        IntegerExpressionVariable one_3 = Choco.plus(Choco.plus(a, a), c2);
        IntegerExpressionVariable two_3 = Choco.plus(e, Choco.mult(c3, constant));
        model.addConstraint(Choco.eq(one_3, two_3));

        IntegerExpressionVariable one_4 = Choco.plus(Choco.plus(n, r), c3);
        IntegerExpressionVariable two_4 = Choco.plus(b, Choco.mult(c4, constant));
        model.addConstraint(Choco.eq(one_4, two_4));

        IntegerExpressionVariable one_5 = Choco.plus(Choco.plus(o, e), c4);
        IntegerExpressionVariable two_5 = Choco.plus(o, Choco.mult(c5, constant));
        model.addConstraint(Choco.eq(one_5, two_5));

        IntegerExpressionVariable one_6 = Choco.plus(Choco.plus(d, g), c5);
        IntegerExpressionVariable two_6 = Choco.plus(r, Choco.mult(c6, constant));

        model.addConstraint(Choco.eq(one_6, two_6));

        // last line
        model.addConstraint(Choco.eq(c6, 0));

        // all different
        model.addConstraint(Choco.allDifferent(d, o, n, a, l, g, e, r, b, t));
        Solver s = new CPSolver();
        s.read(model);
        s.solveAll();
        // Print name value

       // System.out.println(s.pretty());

        // Print name value
        // System.out.println("get domain for donald" + s.getVar(donald).getDomain());
        // System.out.println("get domain for gerald" + s.getVar(gerald).getDomain());
        // System.out.println("get domain for robert" + s.getVar(robert).getDomain());
//        System.out.println("donald␣=␣" + s.getVar(donald).getVal());
//        System.out.println("gerald␣=␣" + s.getVar(gerald).getVal());
//        System.out.println("robert␣=␣" + s.getVar(robert).getVal());
        System.out.println("donald: " + s.getVar(d).getVal() + s.getVar(o).getVal() + s.getVar(n).getVal()
                + s.getVar(a).getVal() + s.getVar(l).getVal() + s.getVar(d).getVal());
    }
}
