package opg3;

public class trådklasse2 extends Thread {
    private faelles ba;

    public trådklasse2(faelles ba) {
        this.ba = ba;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {



                ba.kritisksection();
                ba.tagerRandomTid(100);

        }


        System.out.println(ba.getGlobal());
    }
}
