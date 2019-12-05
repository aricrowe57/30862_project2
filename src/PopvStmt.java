import java.nio.ByteBuffer;

public class PopvStmt extends Stmt {
    public void genCode(String[] tokens){
        String var_name = "main " + tokens[1];

        int[] value = symbolTable.get(var_name);
        int mem_address = value[0];
        //push mem address
        String[] push_tokens = {"pushi", Integer.toString(mem_address)};
        StatementFactory.getStatement("pushi").genCode(push_tokens);
        // popv
        byte [] popv_bytes = ByteBuffer.allocate(4).putInt(POPV).array();
        mem.add(popv_bytes[3]);
        pc += 1;
    }
}
