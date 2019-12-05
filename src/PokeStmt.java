import java.nio.ByteBuffer;

public class PokeStmt extends Stmt {
    public void genCode(String[] tokens){
        //pushi (var)
        String var_name = "main " + tokens[2];
        //System.out.println(var_name);
        int[] value = symbolTable.get(var_name);
        int mem_address = value[0];
        //push mem address
        String[] push_tokens = {"pushi", Integer.toString(mem_address)};
        StatementFactory.getStatement("pushi").genCode(push_tokens);

        //pushi val
        //bc.peek<type>
        String[] tokens_2 = {"pushi", tokens[1]};
        StatementFactory.getStatement(tokens_2[0]).genCode(tokens_2);
        byte [] poke_bytes = ByteBuffer.allocate(4).putInt(POKEI).array();
        mem.add(poke_bytes[3]);
        pc += 1;
    }
}