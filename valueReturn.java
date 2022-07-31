public class valueReturn{
    int value = 10;
    int returnValue;
    public static void main(String[] args){
        valueReturn vr = new valueReturn();
        work w = new work();
        vr.returnValue = w.assign(vr.value);

        System.out.println("valueReturn.value = " + vr.returnValue);
    }
}

class work{
    public int assign(int value){
        return value+1;
    }
}