import java.util.ArrayList;

public class Opgave2 {
//Find nuller

    public int max(ArrayList<Integer> list) {
        return maximum(list, 0, list.size() - 1);
    }

    private int maximum(ArrayList<Integer> list, int l, int h) {

        if (l == h) {
            return list.get(l) == 0 ? 1 : 0;
            //retuner
        } else {
            int m = (l + h) / 2;
            int max1 = maximum(list, l, m);
            int max2 = maximum(list, m + 1, h);
            return max1 + max2;

        }
    }
}
