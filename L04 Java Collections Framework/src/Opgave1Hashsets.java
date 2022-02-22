import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Opgave1Hashsets {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(34);
        set.add(12);
        set.add(23);
        set.add(45);
        set.add(67);
        set.add(34);
        set.add(98);

        //man kan gøre sådan her
      //  set.addAll(List.of(34,12,23,45,67,98));

        System.out.println(set);

        System.out.println("tilføjer 23");
// man kan ikke tilføje det samme til et set 2 gange
        set.add(23);
        System.out.println();
        System.out.println(set);

        System.out.println("sletter 67");
        set.remove(67);
        System.out.println(set);
        System.out.println();

        System.out.println();
        System.out.println("Inde holder settet nummer 23 " + set.contains(23));

        System.out.println("Hvor stort er settet? "+ set.size());



    }
}
