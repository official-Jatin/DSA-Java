public class binTOdeci {
    

public static void decToBin(int n ) {

    int pow = 0 ;

    int  binNum = 0;

    while (n > 0 ) {

        int remender = n % 2 ; 

        binNum = binNum  + (int) Math.pow(10, pow);
        pow ++;

        n = n / 2;
 
    } 
    System.out.println(binNum);
}

public static void main ( String args[]) {

    decToBin(10);
}
    

}
