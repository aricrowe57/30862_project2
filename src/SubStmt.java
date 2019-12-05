import java.nio.ByteBuffer;

public class SubStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] sub_bytes = ByteBuffer.allocate(4).putInt(SUB).array();
        mem.add(sub_bytes[3]);
        pc += 1;
    }
}
