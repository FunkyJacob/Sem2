package opg3;

public class test {


    public static void main(String[] args) {

        faelles ba = new faelles();
        trådklassen bat1 = new trådklassen(ba);
        trådklasse2 bat2 = new trådklasse2(ba);

        bat1.start();
        bat2.start();
    }

}
