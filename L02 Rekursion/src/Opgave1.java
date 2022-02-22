public class Opgave1 {

    public static int binomial(int n, int m){

        if (m==0 || m == n){
            return 1;
        }
        if (m > n ){
            return 0;
        }
        else return binomial(n-1 , m) + binomial(n-1,m-1) ;
    }

    public static void main(String[] args) {
        System.out.println(binomial(7,8));
    }
}
