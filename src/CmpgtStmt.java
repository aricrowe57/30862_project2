import java.nio.ByteBuffer;

public class CmpgtStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] cmpgt_bytes = ByteBuffer.allocate(4).putInt(CMPGT).array();
        mem.add(cmpgt_bytes[3]);
        pc += 1;
    }
}