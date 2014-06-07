package antlrmain;

import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;

import java.util.List;
import java.util.Map;

/**
 * Created by kbrusch on 6/7/14.
 */
public class PlusCond {
    private List<List<Character>> blocks;
    private Map<Character, IntegerVariable> charIntVars;
    private Map<String, IntegerVariable> carries;
    private List<Constraint> blockWordConstraints;
    private List<Constraint> firstCharGT0;
    private List<Constraint> columnConstraints;


    public PlusCond(List<List<Character>> blocks, Map<Character, IntegerVariable> charsIntVars, Map<String, IntegerVariable> carries, List<Constraint> blockWordsConstraints, List<Constraint> firstCharGT0) {
        this.blocks = blocks;
        this.charIntVars = charsIntVars;
        this.carries = carries;
        this.blockWordConstraints = blockWordsConstraints;
        this.firstCharGT0 = firstCharGT0;
    }

    public List<List<Character>> getBlocks() {
        return blocks;
    }

    public Map<Character, IntegerVariable> getCharIntVars() {
        return charIntVars;
    }

    public Map<String, IntegerVariable> getCarries() {
        return carries;
    }

    public List<Constraint> getBlockWordConstraints() {
        return blockWordConstraints;
    }

    public List<Constraint> getFirstCharGT0() {
        return firstCharGT0;
    }

    public int getWordLength() {
        return blocks.get(0).size();
    }

    public IntegerVariable getCharVarAt(int i, int col) {
        // bei col = 0 soll der Buchstabe ganz links zurückkommen.
        Character c = blocks.get(i).get(getWordLength() - 1 - col);
        return charIntVars.get(c);
    }

    public IntegerVariable getCarryAt(int col) {
        return carries.get("c" + col);
    }

    public List<Constraint> getColumnConstraints() {
        return columnConstraints;
    }

    public void setColumnConstraints(List<Constraint> columnConstraints) {
        this.columnConstraints = columnConstraints;
    }
}
