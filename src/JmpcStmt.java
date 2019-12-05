import java.nio.ByteBuffer;

public class JmpcStmt extends Stmt {
    public void genCode(String[] tokens){
        if(!first_run) {
            String label_name = tokens[1] + " label";
            int[] value = symbolTable.get(label_name);
            int pc_to_jump_to = value[0] + 1;
            //push pc_to_jump_to
            String[] push_tokens = {"pushi", Integer.toString(pc_to_jump_to)};
            StatementFactory.getStatement("pushi").genCode(push_tokens);
        }
        else{
            pc+=5;
        }
        // jmpc
        byte [] jmpc_bytes = ByteBuffer.allocate(4).putInt(JMPC).array();
        mem.add(jmpc_bytes[3]);
        pc += 1;
    }
}
