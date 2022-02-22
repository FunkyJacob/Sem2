import java.util.ArrayList;

public class Opgave0 {

    public static int sum(ArrayList<Integer> list, int index){
        int results = 0;
        if (index == list.size()){
            return results;
        }
        else if (list.get(index)%2 == 0){
            return results + 1 + sum(list,index+1);

        }
        else return sum(list,index+1);
    }
//Dette er metoden som udregner det hele og har altid start index 0

    public static int even(ArrayList<Integer> list){
        return sum(list,0);
    }
//Dette er den metode som bliver kaldt også en hjælpe metode

    public static void main(String[] args) {
        ArrayList<Integer> lol = new ArrayList<>();
        lol.add(1);
        lol.add(2);
        lol.add(4);
        lol.add(6);
        lol.add(8);
        lol.add(7);

        System.out.println(even(lol));


    }
}
