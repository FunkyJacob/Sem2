package opg2;

public class trådklasse2 extends Thread {
    private faelles ba;

    public trådklasse2(faelles ba) {
        this.ba = ba;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            test.setFlag(true, 1);
            test.setTurn(0);
            while (test.getFlag(0) && test.getTurn() == 0) {}


                ba.kritisksection();
                test.setFlag(false,1);
                ba.tagerRandomTid(100);

        }


        System.out.println(ba.getGlobal());
    }
}
