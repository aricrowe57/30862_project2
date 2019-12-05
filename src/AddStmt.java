import java.nio.ByteBuffer;

public class AddStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] add_bytes = ByteBuffer.allocate(4).putInt(ADD).array();
        mem.add(add_bytes[3]);
        pc += 1;
    }
}