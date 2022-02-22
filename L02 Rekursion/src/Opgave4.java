public class Opgave4 {

    public static void Anagram(String prefix, String tekst){

        if (tekst.length() <= 1)
            System.out.println(prefix + tekst);

        else for (int i = 0; i < tekst.length(); i++){
            String p = prefix + tekst.charAt(i);
            String w = tekst.substring(0,i) + tekst.substring(i+1);
            Anagram(p,w);
        }
        }

    public static void main(String[] args) {
        Anagram("","abcd");


    }
}
