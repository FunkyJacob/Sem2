public class Opgave2 {

    public static boolean isPalidrome(String s){

        if (s.length() <= 1) {
            return true;
        }
        else
              return s.charAt(0) == s.charAt(s.length()-1) && isPalidrome(s.substring(1,s.length()-1));

    }

    public static void main(String[] args) {
        System.out.println("lollol");
        System.out.println(isPalidrome("lollol"));
        System.out.println();

        System.out.println("");
    }
}
