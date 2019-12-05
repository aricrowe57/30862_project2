import java.nio.ByteBuffer;

public class PushvStmt extends Stmt {
    public void genCode(String[] tokens){
        String var_name = tokens[1];
        int[] value = symbolTable.get(var_name);
        int mem_address = value[0];
        String[] push_tokens = {"pushi", Integer.toString(mem_address)};
        StatementFactory.getStatement("pushi").genCode(push_tokens);
        byte [] pushvi_bytes = ByteBuffer.allocate(4).putInt(PUSHVI).array();
        mem.add(pushvi_bytes[3]);

        pc += 1;

    }
}