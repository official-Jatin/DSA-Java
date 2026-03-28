public class binTOdeci {
    

public static void bindeci (int binNum) {

    int pow = 0 ;

    int deciNum = 0 ;

    while ( binNum > 0 ) {
        int lastDig = binNum % 10 ;

        deciNum = deciNum + lastDig * (int)Math.pow(2 , pow);

        pow++;
        binNum /= 10;

    }
    System.out.println(deciNum);
} 



public static void main ( String args[]) {

    bindeci(10);
}
    

}
