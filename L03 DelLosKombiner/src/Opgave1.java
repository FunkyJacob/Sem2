import java.util.ArrayList;
import java.util.List;

public class Opgave1 {


//    Write a recursive method that totals all the elements in a List<Integer>. Use the template from
//    Divide-Solve-Combine (Del, Løs og kombiner).


    public static int max(ArrayList<Integer> list) {
        return maximum(list, 0, list.size() - 1);

    }

    private static int maximum(ArrayList<Integer> list, int l, int h) {

        if (l == h) {
            return list.get(l) ;
        } else {
            int m = (l + h) / 2;
            int max1 = maximum(list, l, m);
            int max2 = maximum(list, m + 1, h);
            return max1 + max2;

        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> lol = new ArrayList<>();
        lol.add(1);
        lol.add(4);
        lol.add(7);


        max(lol);
    }

}

