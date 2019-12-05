import java.nio.ByteBuffer;
import java.util.Arrays;

public class PushiStmt extends Stmt {
    public void genCode(String[] tokens){
        byte [] pushi_bytes = ByteBuffer.allocate(4).putInt(PUSHI).array();
        //System.out.println("Value: " + tokens[1]);
        int value = Integer.parseInt(tokens[1].trim());
        //System.out.println("Value: " + value);
        byte [] bytes = ByteBuffer.allocate(4).putInt(value).array();
        //Integer[] bytes = Arrays.copyof(value, value.length);
        mem.add(pushi_bytes[3]);
        mem.add(bytes[3]);
        mem.add(bytes[2]);
        mem.add(bytes[1]);
        mem.add(bytes[0]);
        pc += 5;
    }
}