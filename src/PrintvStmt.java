import java.nio.ByteBuffer;

public class PrintvStmt extends Stmt {
    public void genCode(String[] tokens){
        //bc.pushi (var)
        String var_name = tokens[1];
        int[] value = symbolTable.get(var_name);
        int mem_address = value[0];
        String[] push_tokens = {"pushi", Integer.toString(mem_address)};
        StatementFactory.getStatement("pushi").genCode(push_tokens);
        //bc.pushv<type> // type is the var
        String[] pushv_tokens = {"pushv", Integer.toString(mem_address)};
        StatementFactory.getStatement("pushv").genCode(pushv_tokens);
        //bc.print<type>
        byte [] printi_bytes = ByteBuffer.allocate(4).putInt(PRINTI).array();
        mem.add(printi_bytes[3]);
        pc += 1;
    }
}
