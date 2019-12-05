
import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Stmt {

    public static Map<String, int[]> symbolTable = new HashMap<>();
    public static ArrayList<Byte> mem = new ArrayList<>(); // opcodes
    static int pc = -1; // program counter
    static int fo = -1; // number of local variables in a function
    static boolean first_run = true;
    public void genCode(String[] tokens){
        System.out.println("General");
    }

    public static final int HALT = 0;
    public static final int JMP = 36;
    public static final int JMPC = 40;
    public static final int PUSHI = 70;
    public static final int PUSHVI = 74;
    public static final int POPM = 76;
    public static final int POPA = 77;
    public static final int POPV = 80;
    public static final int PEEKI = 86;
    public static final int POKEI = 90;
    public static final int SWP = 94;
    public static final int ADD = 100;
    public static final int SUB = 104;
    public static final int MUL = 108;
    public static final int DIV = 112;
    public static final int CMPE = 132;
    public static final int CMPLT = 136;
    public static final int CMPGT = 140;
    public static final int PRINTI = 146;
    public static final int LABEL = -1;
    public static final int SHORT = 0;
    public static final int INT = 1;
    public static final int FLOAT = 2;
    public static final int RET = 48;



    /*public ArgObj Sparser(String[] tokens){
        SArgObj argument_object = new SArgObj();
        argument_object.setString(tokens[1]);
        return argument_object;
    }
    public ArgObj SSparser(String[] tokens){
        SSArgObj argument_object = new SSArgObj();
        argument_object.setStr1(tokens[1]);
        argument_object.setStr2(tokens[2]);
        return argument_object;
    }
    public ArgObj SIparser(String[] tokens){
        SIArgObj argument_object = new SIArgObj();
        try
        {
            int i = Integer.parseInt(tokens[1].trim());
            argument_object.setInt(i);
            argument_object.setString(tokens[2]);
        }
        catch (NumberFormatException nfe)
        {
            int i = Integer.parseInt(tokens[2].trim());
            argument_object.setInt(i);
            argument_object.setString(tokens[1]);
        }
        return argument_object;
    }
    public ArgObj Nullparser(String[] tokens){
        return new NullArgObj();
    }
    public ArgObj FPparser(String[] tokens){
        FPArgObj argument_object = new FPArgObj();
        float i = Float.parseFloat(tokens[1].trim());
        argument_object.setFloat(i);
        return argument_object;
    }
    public ArgObj Iparser(String[] tokens){
        IArgObj argument_object = new IArgObj();
        int i = Integer.parseInt(tokens[1].trim());
        argument_object.setInt(i);
        return argument_object;
    }*/
}
