import java.nio.ByteBuffer;

public class PrintvStmt extends Stmt {
    public void genCode(String[] tokens){
        String var_name = "main " + tokens[1];
        int[] value = symbolTable.get(var_name);
        int mem_address = value[0];
        String[] pushv_tokens = {"pushv", tokens[1]};
        StatementFactory.getStatement("pushv").genCode(pushv_tokens);
        byte [] printi_bytes = ByteBuffer.allocate(4).putInt(PRINTI).array();
        mem.add(printi_bytes[3]);
        pc += 1;
    }
}
