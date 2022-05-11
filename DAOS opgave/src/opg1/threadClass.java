package opg1;
public class threadClass extends Thread{

    private faelles ba;
    private String navn;

    public threadClass(String navn ,faelles ba) {
        this.ba = ba;
    }

    public void run() {
        for (int j=0; j<100;j++) {
            ba.kritisksection();
            ba.tagerRandomTid(100);
        }
        System.out.println(ba.getGlobal());
    }
}
