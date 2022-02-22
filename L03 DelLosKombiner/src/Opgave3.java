import java.util.ArrayList;

public class Opgave3 {
//    The paper on Divide-Solve-Combine contains most of the code necessary to do a merge sort.
//    The implementation of the method merge() is missing.
//    Write the merge() method.
//    Test your merge sort on [8, 56, 45, 34, 15, 12, 34, 44].

    public class MergeSort {
        public static void main(String[] args) {
           ArrayList<Integer> lol = new ArrayList<>();
           lol.add(8);
           lol.add(56);
           lol.add(45);
           lol.add(34);
           lol.add(15);
           lol.add(12);
           lol.add(34);
           lol.add(44);



        }

        private void mergesort(ArrayList<Integer> list, int l, int h) {
            int mid = (l + h)/2;
            if(l == h){

            }else if(h - l == 1){
                merge(list,l, mid ,h);
            }else{
                h = mid;
            }

        }

        private void merge(ArrayList<Integer> list,
                           int low, int middle, int high) {
            int x;
            int i;
            ArrayList<Comparable> left = new ArrayList<Comparable>();
            ArrayList<Comparable> right = new ArrayList<Comparable>();
            mergesort(list,low,middle);
            for(i = 0; i < list.size() - middle; i++){
                left.add(i,list.get(i));
                list.remove(i);
            }
            mergesort(list,middle,high);
            for (x = middle; x < list.size(); x++) {
                right.add(x,list.get(x));
                list.remove(x);
            }
            if ((left.get(i).compareTo(right.get(x))) > 0) {
                i++;
                list.add(i);
            } else if (i < x) {
                x++;
                list.add(x);
            }


            System.out.println();
            System.out.println("Merge");
            System.out.println();

            // ...
        }

        public void mergesort(ArrayList<Integer> list) {


        }
    }
}
