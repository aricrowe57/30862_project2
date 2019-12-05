import java.io.*;
import java.util.*;
import java.util.Arrays;

//test: Hello

public class Main {
    public static void main(String[ ] args) {
        String filePath = args[0];

        File file = new File(filePath);
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                lines.add(st);
            }
            br.close();
            //System.out.println(lines);
        }
        catch (Exception e){
            System.err.format("Exception occurred trying to read '%s'.", filePath);
            e.printStackTrace();
        }

        //Create labels
        for(int j = 0; j < lines.size(); j++) {
            String line = lines.get(j).trim();
            line = line.replaceAll(",", " , ");
            line = line.replaceAll("\\s+", " ");
            String[] tokens = line.split("\\s");
            String token = tokens[0];
            if (token != null) {
                if (token.matches("add|callr|call|cmpe|cmpgt|cmplt|decl|div|jmpc|jmp|lab|mul|peek|poke|popm|popv|printc|printf|printi|prints|printv|pushc|pushf|pushi|pushs|pushv|retr|ret|subr|sub|swp")) {
                    StatementFactory.getStatement(token).genCode(tokens);
                }
            }
        }
        Stmt.mem.clear();
        Stmt.pc = -1;
        Stmt.fo = -1;
        Stmt.first_run = false;

        for(int i = 0; i < lines.size(); i++) {
            String line = lines.get(i).trim();
            line = line.replaceAll(",", " , ");
            line = line.replaceAll("\\s+", " ");
            String[] tokens = line.split("\\s");
            String token = tokens[0];
            if (token != null) {
                if (token.matches("add|callr|call|cmpe|cmpgt|cmplt|decl|div|jmpc|jmp|lab|mul|peek|poke|popm|popv|printc|printf|printi|prints|printv|pushc|pushf|pushi|pushs|pushv|retr|ret|subr|sub|swp")) {
                    StatementFactory.getStatement(token).genCode(tokens);
                } else {
                    System.out.println("Unknown stmt: "+token);
                }
            }
        }
        Stmt stmt = new Stmt();
        String file_2 = "my_Basics.bin";
        Byte[] mem = stmt.mem.toArray(new Byte[stmt.mem.size()]);
        byte[] bytes = new byte[stmt.mem.size()];
        int j=0;
        for(Byte b: mem)
            bytes[j++] = b.byteValue();
        try {
            FileOutputStream os = new FileOutputStream(file_2);
            byte[] hardcode = {0b01000110, 0b00010000, 0b00000000, 0b00000000, 0b00000000, 0b01000110, 0b00010001, 0b00000000, 0b00000000, 0b00000000, 0b01000110, 0b00000001, 0b00000000, 0b00000000, 0b00000000, 0b00101100, 0b00000000};
            os.write(hardcode);
            os.write(bytes);
        }
        catch (Exception e) {
            System.out.println("FileException");
        }

    }
}
