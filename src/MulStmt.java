import java.nio.ByteBuffer;

public class MulStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] mul_bytes = ByteBuffer.allocate(4).putInt(MUL).array();
        mem.add(mul_bytes[3]);
        pc += 1;
    }
}
