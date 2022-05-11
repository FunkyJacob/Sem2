package opg3;

public class trådklassen extends Thread {


    private faelles fa;

    public trådklassen(faelles fa) {
        this.fa = fa;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {

            fa.kritisksection();

            fa.tagerRandomTid(100);

        }

        System.out.println(fa.getGlobal());
    }
}
