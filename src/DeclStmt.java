public class DeclStmt extends Stmt {
    public void genCode(String[] tokens){
        //symbolTable.put(tokens[1], )
        String var_name = "main" + " " + tokens[1];
        int type = -1;
        if(tokens[2].equals("int")){
            type = INT;
        }
        else if(tokens[2].equals("short")){
            type = SHORT;
        }
        else if (tokens[2].equals("float")){
            type = FLOAT;
        }
        int[] value = {++fo, type};
        symbolTable.put(var_name, value);
        String[] tokens_2 = {"pushi", "0"};
        StatementFactory.getStatement(tokens_2[0]).genCode(tokens_2);
    }
}
