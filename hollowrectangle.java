public class hollowrectangle {

    public static void hollow(int totRow , int totCol) {
             //outerloop
        for (int i = 1 ; i <= totRow ; i++) {
                //boundrie
            for (int j = 1 ; j <= totCol ; j++ ) {

                if( i == 1 || i == totRow || j == 1 || j == totCol) {

                   System.out.print("*"); 
                }  else {

                    System.out.print(" ");
                }
            } System.out.println();
        }
    }
    public static void main (String args[]) {

        hollow(10,7);

    }
}
