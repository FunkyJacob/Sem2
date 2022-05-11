package opg1;


public class main {
    public static void main(String[] args) {
        faelles ba = new faelles();
        threadClass bat1 = new threadClass("lol",ba);
        threadClass bat2 = new threadClass("lol2",ba);

        bat1.start();
        bat2.start();

    }
}
