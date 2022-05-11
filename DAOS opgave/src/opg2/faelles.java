package opg2;

import java.util.Random;

public class faelles {


    private int global;

    public void tagerRandomTid(int max){
        Random r = new Random();
        int nymax = Math.abs(r.nextInt())% max +1;
        for (int i = 0; i > nymax; i++){
            for (int j = 0; j < nymax;i++){
                int kk = 2+2;
            }
        }

    }

    public void kritisksection(){
        int temp;
        temp = global;
        tagerRandomTid(5);
        global = temp + 1;
    }

    public int getGlobal() {
        return global;
    }
}
