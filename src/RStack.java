import java.util.*;
public class RStack {
    List<DataObject> runtimeStack;
    private int stackPointer;

    public RStack() {
        this.stackPointer = -1;
        runtimeStack = new ArrayList<DataObject>();
    }

    public void push(DataObject dob) {
        runtimeStack.add(dob);
    }

    public DataObject remove(int index) {
        return runtimeStack.remove(index);
    }

    public DataObject getIndex(int index) {
        return runtimeStack.get(index);
    }

    public void incrementPointer() {
        this.stackPointer += 1;
    }

    public void decrementPointer() {
        this.stackPointer -= 1;
    }

    public void setSP(int value) {
        this.stackPointer = value;
    }

    public int getSP() {
        return this.stackPointer;
    }

    public void getVal(int index) {
        if (runtimeStack.get(index).getType().equals("CHAR")) {
            System.out.print(runtimeStack.get(index).getCharVal());
        }
        else if (runtimeStack.get(index).getType().equals("INT")) {
            System.out.print(runtimeStack.get(index).getIntVal());
        }
        else if (runtimeStack.get(index).getType().equals("FLOAT")) {
            System.out.print(runtimeStack.get(index).getFloatVal());
        }
        else if (runtimeStack.get(index).getType().equals("SHORT")) {
            System.out.print(runtimeStack.get(index).getShortVal());
        }

    }

    public void changeObject(int index, DataObject dob) {
        if (dob.getType().equals("INT")) {
            this.runtimeStack.get(index).setVal(dob.getType(), dob.getIntVal());
        }
        else if (dob.getType().equals("FLOAT")) {
            this.runtimeStack.get(index).setVal(dob.getType(), dob.getFloatVal());
        }
        else if (dob.getType().equals("SHORT")) {
            this.runtimeStack.get(index).setVal(dob.getType(), dob.getShortVal());
        }
        else {
            this.runtimeStack.get(index).setVal(dob.getType(), dob.getCharVal());
        }
    }

    public int compareEquals(DataObject dob1, DataObject dob2) {
        if (dob1.getIntVal() == dob2.getIntVal()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public int compareLess(DataObject dob1, DataObject dob2) {
        if (dob1.getIntVal() > dob2.getIntVal()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public int compareMore(DataObject dob1, DataObject dob2) {
        if (dob1.getIntVal() < dob2.getIntVal()) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public short convertShort(byte[] mem, int pc) {
        int r = mem[pc+1] & 0xFF;
        r = (r << 8) | (mem[pc+2] & 0xFF);
        short s = (short)r;
        return s;
    }

    public int convertInt(byte[] mem, int pc) {
        byte[] helper = Arrays.copyOfRange(mem, pc+1, pc+5);
        return ((helper[0] & 0xFF) << 0) | ((helper[1] & 0xFF) << 8) | ((helper[2] & 0xFF) << 16) | ((helper[3] & 0xFF) << 24);

    }

    public void printPre() {
        System.out.println("sp: " + this.getSP());
        System.out.print("rstack: ");
        if (runtimeStack.size() == 0) {
            System.out.print("empty");
        }
        else {
            for (int parsing = 0; parsing < runtimeStack.size(); parsing++ ) {
                getVal(parsing);
            }
        }
        System.out.println();
    }

    public float convertFloat(byte[] mem, int pc) {
        byte[] helper = Arrays.copyOfRange(mem, pc+1, pc+5);
        return ((helper[0] & 0xFF) << 0) | ((helper[1] & 0xFF) << 8) | ((helper[2] & 0xFF) << 16) | ((helper[3] & 0xFF) << 24);
    }

}