package antlrmain;

import choco.kernel.model.constraints.Constraint;
import choco.kernel.model.variables.integer.IntegerVariable;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by kbrusch on 6/7/14.
 */
public class PlusCond {
    private List<List<Character>> blocks;
    private Map<Character, IntegerVariable> globalCharIntVars;
    private Map<String, IntegerVariable> carries;
    private List<Constraint> firstCharGT0;
    private List<Constraint> columnConstraints;


    public PlusCond(List<List<Character>> blocks, Map<Character, IntegerVariable> charsIntVars, Map<String, IntegerVariable> carries, List<Constraint> firstCharGT0) {
        this.blocks = blocks;
        this.globalCharIntVars = charsIntVars;
        this.carries = carries;
        this.firstCharGT0 = firstCharGT0;
    }

    public Map<Character, IntegerVariable> getGlobalCharIntVars() {
        return globalCharIntVars;
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
        return globalCharIntVars.get(c);
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

    public Set<Constraint> getAllConstraints() {
        Set<Constraint> cs = new HashSet<>();
        cs.addAll(getFirstCharGT0());
        cs.addAll(getColumnConstraints());
        return cs;
    }
}
