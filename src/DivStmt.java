import java.nio.ByteBuffer;

public class DivStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] div_bytes = ByteBuffer.allocate(4).putInt(DIV).array();
        mem.add(div_bytes[3]);
        pc += 1;
    }
}
