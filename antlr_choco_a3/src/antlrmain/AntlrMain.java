package antlrmain; /**
 * Created by kbrusch on 5/17/14.
 */

import org.antlr.runtime.*;
import org.antlr.runtime.tree.CommonTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class AntlrMain {

    public static void main(String[] args) throws Exception {


        InputStream is = new FileInputStream("/Users/kbrusch/Google Drive/project/constraints/src/antlrmain/PuzzleSolverExample.txt");

        System.out.println("stream build");
        ANTLRInputStream input = new ANTLRInputStream(is);
        System.out.println("input");
        PuzzleSolverLexer lexer = new PuzzleSolverLexer(input);
        System.out.println("lexer");
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println("tokens");
        PuzzleSolverParser parser = new PuzzleSolverParser(tokens);
        System.out.println("parser");
        PuzzleSolverParser.prog_return r = parser.prog();
        System.out.println("prog_return");
        CommonTree t = (CommonTree)r.getTree();
        System.out.println("AST: " + t.toStringTree());

    }
}
