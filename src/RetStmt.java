import java.nio.ByteBuffer;

public class RetStmt extends Stmt {
    public void genCode(String[] tokens){
        String[] tokens_2 = {"pushi", "0"};
        StatementFactory.getStatement(tokens_2[0]).genCode(tokens_2);
        byte [] popa_bytes = ByteBuffer.allocate(4).putInt(POPA).array();
        mem.add(popa_bytes[3]);
        byte [] ret_bytes = ByteBuffer.allocate(4).putInt(RET).array();
        mem.add(ret_bytes[3]);
        //byte [] ret_bytes = ByteBuffer.allocate(4).putInt(RET).array();
        //bc.ret // jmp to the location at the top of the stack – the return
// address
    }
}
