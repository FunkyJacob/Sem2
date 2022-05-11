package Opgave2;

public class Counter {
    private static Counter single_instance = null;
    private int value = 0;



    private Counter(){
        value = 0;
    }

    public static Counter getInstance() {
        if (single_instance == null) {
            single_instance = new Counter();
        }
        return single_instance;
    }

//Dette gør at der kun kan være en af denne constructor

    public void count(){
        value++;
    }

    public void times2(){
        value = value *2;
    }

    public void zero(){
        value = 0;
    }

    public int getValue() {
        return value;
    }
}
