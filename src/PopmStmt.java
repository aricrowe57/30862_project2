import java.nio.ByteBuffer;

public class PopmStmt extends Stmt {
    public void genCode(String[] tokens){
        String[] tokens_2 = {"pushi", tokens[1]};
        StatementFactory.getStatement(tokens_2[0]).genCode(tokens_2);
        byte [] printi_bytes = ByteBuffer.allocate(4).putInt(POPM).array();
        mem.add(printi_bytes[3]);
        pc += 1;
    }
}
