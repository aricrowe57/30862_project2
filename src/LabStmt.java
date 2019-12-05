public class LabStmt extends Stmt {
    public void genCode(String[] tokens) {
        String label = tokens[1] + " label";
        int[] value = {pc+17};
        symbolTable.put(label, value);
    }
}