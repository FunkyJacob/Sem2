package opg2;

public class trådklassen extends Thread {


    private faelles fa;

    public trådklassen(faelles fa) {
        this.fa = fa;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {

            test.setFlag(true, 0);
            test.setTurn(1);
            while (test.getFlag(1) && test.getTurn() == 1) {
            }

            fa.kritisksection();
            test.setFlag(false,0);
            fa.tagerRandomTid(100);

        }

        System.out.println(fa.getGlobal());
    }
}
