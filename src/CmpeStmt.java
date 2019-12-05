import java.nio.ByteBuffer;

public class CmpeStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] cmpe_bytes = ByteBuffer.allocate(4).putInt(CMPE).array();
        mem.add(cmpe_bytes[3]);
        pc += 1;
    }
}