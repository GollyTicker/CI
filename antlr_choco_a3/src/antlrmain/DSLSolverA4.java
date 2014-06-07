package antlrmain;

import choco.kernel.model.constraints.Constraint;
import choco.kernel.solver.Solver;
import org.antlr.runtime.tree.CommonTree;


import java.util.List;
import java.util.Objects;

/**
 * Created by kbrusch on 6/7/14.
 */
public class DSLSolverA4 {

    public static Solver solveFromTree(CommonTree tree) {

        List<Constraint> conds = toConstraints(tree);

        return mkModel(conds);

    }

    private static Solver mkModel(List<Constraint> conds) {
        // T O DD O
        return null;
    }

    public static List<Constraint> toConstraints(CommonTree tree){

        for (Object child:tree.getChildren()) {
            CommonTree plus = (CommonTree)child;
            CommonTree block_0 = (CommonTree) plus.getChild(0);
            CommonTree block_1 = (CommonTree) plus.getChild(1);
            CommonTree block_2 = (CommonTree) plus.getChild(2);

            System.out.println("Plus: " + plus.toStringTree());

            List<Character> chars_0 = (List<Character>) block_0.getChildren();
            List<Character> chars_1 = (List<Character>) block_1.getChildren();
            List<Character> chars_2 = (List<Character>) block_2.getChildren();

            System.out.println("Letters 0: " + chars_0.toString());
            System.out.println("Letters 1: " + chars_1.toString());
            System.out.println("Letters 2: " + chars_2.toString());

        }


     return null;
    }

}
