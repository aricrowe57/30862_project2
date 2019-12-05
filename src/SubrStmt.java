public class SubrStmt extends Stmt {
    public void genCode(String[] tokens) {
        int [] value = {0, 0};
        symbolTable.put(tokens[1], value);
    }
}
