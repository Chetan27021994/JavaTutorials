public class Main {
    public static void main(String[] args) {
        int num = 123554789;

        if (isTwinPrime(num)) {
            System.out.println(num + " is a twin prime number.");
        } else {
            System.out.println(num + " is not a twin prime number.");
        }
    }


    public static boolean isTwinPrime(int n) {

        if (!isPrime(n)) return false;


        return (isPrime(n - 2) || isPrime(n + 2));
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
