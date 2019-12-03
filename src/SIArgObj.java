public class SIArgObj extends ArgObj {
    private String str;
    private int i;
    public String getString(){
        return str;
    }
    public int getInt(){
        return i;
    }
    public void setInt(int arg_i){
        i = arg_i;
    }
    public void setString(String arg_s){
        str = arg_s;
    }
}
