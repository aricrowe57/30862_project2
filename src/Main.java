import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.util.*;
import java.io.IOException;
import java.util.Arrays;

//test: Hello

public class Main {
    public static void main(String[ ] args) {
        String filePath = args[0];
        File file = new File(filePath);
        List<String> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                list.add(st);
            }
            br.close();
            //System.out.println(list);
        }
        catch (Exception e){
            System.err.format("Exception occurred trying to read '%s'.", filePath);
            e.printStackTrace();
        }
        int i;
        for(i = 0; i < list.size(); i++) {
            String line = list.get(i).trim();
            line = line.replaceAll(",", " , ");
            line = line.replaceAll("\\s+", " ");
            String[] tokens = line.split("\\s");
            String token = tokens[0];
            if (token != null) {
                if (token.matches("add|callr|call|cmpe|cmpgt|cmplt|decl|div|jmpc|jmp|lab|mul|peek|poke|popm|popv|printc|printf|printi|prints|printv|pushc|pushf|pushi|pushs|pushv|retr|ret|subr|sub|swp")) {
                    //Stmt stmt = StatementFactory.getStatement(token);
                    //stmt.genCode(tokens);
                    StatementFactory.getStatement(token).genCode(tokens);
                } else {
                    System.out.println("Unknown stmt: "+token);
                }
            }
        }
    }
}
