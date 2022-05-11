package Opgave2;

public class AnvendCounter {
    public static void main(String[] args) {
        Counter c1 = Counter.getInstance();
        Counter c2 = Counter.getInstance();

        c1.count();
        c1.count();
        System.out.println( c2.getValue());
        //Så fordi at de peger på samme counter (fordi der kun kan være en)
        //betyder det at c2 og c1 har samme værdi fordi de er ens

        c1.times2();
        System.out.println();
        System.out.println(c2.getValue());

        c2.zero();
        System.out.println();
        System.out.println(c1.getValue());

    }
}
