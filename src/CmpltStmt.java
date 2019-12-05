import java.nio.ByteBuffer;

public class CmpltStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] cmplt_bytes = ByteBuffer.allocate(4).putInt(CMPLT).array();
        mem.add(cmplt_bytes[3]);
        pc += 1;
    }
}
