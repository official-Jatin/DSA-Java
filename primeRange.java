public class primeRange {

    public static boolean isPrime(int i) {
        if (i < 2) return false;

        for (int p = 2; p <= Math.sqrt(i); p++) {
            if (i % p == 0) {
                return false; // not prime
            }
        }
        return true; // prime
    }

    public static void primeRange(int n) {
        for (int j = 2; j <= n; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
    }

    public static void main(String args[]) {
        primeRange(10);
    }
}