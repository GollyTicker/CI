package antlrmain; /**
 * Created by kbrusch on 5/17/14.
 */

import choco.kernel.solver.Solver;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import static antlrmain.DSLSolverA4.*;
import javax.xml.transform.sax.SAXSource;
import java.io.FileInputStream;
import java.io.InputStream;

public class AntlrMain {

    public static void main(String[] args) throws Exception {


        InputStream is = new FileInputStream("/Users/kbrusch/Google Drive/class/SS_2014/CI/swaneet/CI/antlr_choco_a3/src/antlrmain/PuzzleSolverExample.txt");

        System.out.print("Stream built...");
        //ANTLR parse text files line for line
        ANTLRInputStream input = new ANTLRInputStream(is);
        System.out.print("Input...");
        //which lexer use to extract tokens (our own lexer)
        PuzzleSolverLexer lexer = new PuzzleSolverLexer(input);
        System.out.print("Lexer...");
        //get the tokens from lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.print("Tokens...");
        //erzeuge den parse baum aus den Tokens
        PuzzleSolverParser parser = new PuzzleSolverParser(tokens);
        System.out.print("Parser...");
        //wir callen unsere prog methode in unseren parser
        //wir erhalten unseren parse baum
        PuzzleSolverParser.prog_return r = parser.prog();
        System.out.println("Prog_return.");
        //verarbeiten den parse baum zum AST
        CommonTree t = (CommonTree) r.getTree();

        System.out.println("Old AST: " + t.toStringTree());
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        System.out.println("Generatued node stream...");
        PuzzleSolverTreeGrammar progger = new PuzzleSolverTreeGrammar(nodes);
        CommonTree normalized = (CommonTree)progger.prog().getTree();
        System.out.println("Normalized AST: " + normalized.toStringTree());

        // Praktikum 4
        solveFromTree(normalized);

    }
}
