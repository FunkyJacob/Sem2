package opg2;

public class test {


    private static int turn;
    private static boolean[] flag;

    public static void main(String[] args) {
        flag = new boolean[2];
        flag[0] = false;
        flag[1] = false;
        turn = 1;


        faelles ba = new faelles();
        trådklassen bat1 = new trådklassen(ba);
        trådklasse2 bat2 = new trådklasse2(ba);

        bat1.start();
        bat2.start();
    }
    public static void setFlag(boolean flag, int id) {
        test.flag[id] = flag;
    }

    public static boolean getFlag(int id) {
        return flag[id];
    }

    public static int getTurn() {
        return turn;
    }

    public static void setTurn(int turn) {
        test.turn = turn;
    }
}
