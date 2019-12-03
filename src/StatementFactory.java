public class StatementFactory {
    public static Stmt getStatement(String token){
        if(token.equals("decl")){
            return new DeclStmt();
        }
        else if(token.equals("peek")){
            return new PeekStmt();
        }
        else if(token.equals("printi")){
            return new PrintiStmt();
        }
        else if(token.equals("printf")){
            return new PrintfStmt();
        }
        else if(token.equals("printc")){
            return new PrintcStmt();
        }
        else if(token.equals("prints")){
            return new PrintsStmt();
        }
        else if(token.equals("retr")){
            return new RetrStmt();
        }
        else if(token.equals("call")){
            return new CallStmt();
        }
        else if(token.equals("ret")){
            return new RetStmt();
        }
        else if(token.equals("printv")){
            return new PrintvStmt();
        }
        else if(token.equals("jmp")){
            return new JmpStmt();
        }
        else if(token.equals("jmpc")){
            return new JmpcStmt();
        }
        else if(token.equals("cmpe")){
            return new CmpeStmt();
        }
        else if(token.equals("cmplt")){
            return new CmpltStmt();
        }
        else if(token.equals("cmpgt")){
            return new CmpgtStmt();
        }
        else if(token.equals("callr")){
            return new CallrStmt();
        }
        else if(token.equals("popm")){
            return new PopmStmt();
        }
        else if(token.equals("popv")){
            return new PopvStmt();
        }
        else if(token.equals("poke")){
            return new PokeStmt();
        }
        else if(token.equals("swp")){
            return new SwpStmt();
        }
        else if(token.equals("add")){
            return new AddStmt();
        }
        else if(token.equals("sub")){
            return new SubStmt();
        }
        else if(token.equals("mul")){
            return new MulStmt();
        }
        else if(token.equals("div")){
            return new DivStmt();
        }
        else if(token.equals("pushi")){
            return new PushiStmt();
        }
        else if(token.equals("pushf")){
            return new PushfStmt();
        }
        else if(token.equals("pushs")){
            return new PushsStmt();
        }
        else if(token.equals("pushc")){
            return new PushcStmt();
        }
        else if(token.equals("subr")){
            return new SubrStmt();
        }
        else if(token.equals("lab")){
            return new LabStmt();
        }
        else if(token.equals("pushv")){
            return new PushvStmt();
        }
        else{
            return null;
        }
    }
}
