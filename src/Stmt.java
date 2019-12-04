public class Stmt {
    //private static Map<> symbolTable;
    public void genCode(String[] tokens){
        System.out.println("General");
    }
    public ArgObj Sparser(String[] tokens){
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
    }
}
