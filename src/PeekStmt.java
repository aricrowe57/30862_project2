import java.nio.ByteBuffer;

public class PeekStmt extends Stmt {
    public void genCode(String[] tokens){
        //pushi (var)
        String var_name = "main " + tokens[1];
        int[] value = symbolTable.get(var_name);
        int mem_address = value[0];
        //push mem address
        String[] push_tokens = {"pushi", Integer.toString(mem_address)};
        StatementFactory.getStatement("pushi").genCode(push_tokens);

        //pushi val
        //bc.peek<type>
        String[] tokens_2 = {"pushi", tokens[2]};
        StatementFactory.getStatement(tokens_2[0]).genCode(tokens_2);
        byte [] peek_bytes = ByteBuffer.allocate(4).putInt(PEEKI).array();
        mem.add(peek_bytes[3]);
        pc += 1;

    }
}
