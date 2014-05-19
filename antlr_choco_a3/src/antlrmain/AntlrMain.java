package antlrmain; /**
 * Created by kbrusch on 5/17/14.
 */

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

import javax.xml.transform.sax.SAXSource;
import java.io.FileInputStream;
import java.io.InputStream;

public class AntlrMain {

    public static void main(String[] args) throws Exception {


        InputStream is = new FileInputStream("/Users/kbrusch/Google Drive/project/constraints/src/antlrmain/PuzzleSolverExample.txt");

        System.out.println("stream build");
        //ANTLR parse text files line for line
        ANTLRInputStream input = new ANTLRInputStream(is);
        System.out.println("input");
        //which lexer use to extract tokens (our own lexer)
        PuzzleSolverLexer lexer = new PuzzleSolverLexer(input);
        System.out.println("lexer");
        //get the tokens from lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        System.out.println("tokens");
        //erzeuge den parse baum aus den Tokens
        PuzzleSolverParser parser = new PuzzleSolverParser(tokens);
        System.out.println("parser");
        //wir callen unsere prog methode in unseren parser
        //wir erhalten unseren parse baum
        PuzzleSolverParser.prog_return r = parser.prog();
        System.out.println("prog_return");
        //verarbeiten den parse baum zum AST
        CommonTree t = (CommonTree) r.getTree();

        System.out.println("generatued old AST: " + t.toStringTree());
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
        System.out.println("generatued node stream");
        PuzzleSolverTreeGrammar walker = new PuzzleSolverTreeGrammar(nodes);
        CommonTree normalized = (CommonTree)walker.walk().getTree();
        System.out.println("Normalized AST: " + normalized.toStringTree());

    }
}
