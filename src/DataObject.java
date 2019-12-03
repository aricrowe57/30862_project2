public class DataObject {
    private String type;
    private int intVal;
    private float floatVal;
    private char charVal;
    private short shortVal;

    public DataObject(String type, int intVal) {
        this.type = type;
        this.intVal = intVal;
    }

    public DataObject(String type, float floatVal) {
        this.type = type;
        this.floatVal = floatVal;
    }

    public DataObject(String type, char charVal) {
        this.type = type;
        this.charVal = charVal;
    }

    public DataObject(String type, short shortVal) {
        this.type = type;
        this.shortVal = shortVal;
    }


    public void setVal(String type, int intVal) {
        this.intVal = intVal;
        this.type = type;
    }

    public void setVal(String type, float floatVal) {
        this.floatVal = floatVal;
        this.type = type;
    }

    public void setVal(String type, short shortVal) {
        this.shortVal = shortVal;
        this.type = type;
    }

    public void setVal(String type, char charVal) {
        this.charVal = charVal;
        this.type = type;
    }

    public int getIntVal() {
        return this.intVal;
    }

    public short getShortVal() {
        return this.shortVal;
    }

    public float getFloatVal() {
        return this.floatVal;
    }

    public char getCharVal() {
        return this.charVal;
    }

    public String getType() {
        return this.type;
    }

    public void print() {
        System.out.println("The type is: " + this.type + " and the value is : " + this.intVal);
    }


}