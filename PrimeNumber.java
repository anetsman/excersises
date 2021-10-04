import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
//        Scanner scnr = new Scanner(System.in);
//        System.out.println("Enter number to check if prime or not ");
//        int number = scnr.nextInt();
        System.out.println(isPrime(99));
    }

    private static boolean isPrime(int number) {
        int sqrt = new Double(Math.sqrt(number)).intValue();
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        } return true;
    }
}
