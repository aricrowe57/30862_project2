import java.nio.ByteBuffer;

public class SwpStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] swp_bytes = ByteBuffer.allocate(4).putInt(SWP).array();
        mem.add(swp_bytes[3]);
        pc += 1;
    }
}