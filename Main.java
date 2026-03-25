public class Main{
    public static int facto(int n ) {
        int f = 1;
            for (int i = 1 ; i <= n ; i++) {
                f = f * i ;

            } 
        return f;
    } 

    public static int biono(int n , int r) { 
        int fac_r = facto(n);
        int fac_n = facto(r);

        int facnmr = facto(n-r);

        int ncr = fac_r / fac_n * facnmr ; 
       

        return ncr ;

    }

    public static void main(String[] args) {
        int facr = biono(5, 2);

        System.out.println(facr);
    }
} 