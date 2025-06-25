import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean primeStatus = true;
        if (num <= 1) {
            primeStatus = false;
        } else {

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primeStatus = false;
                    break;
                }
            }

        }
        if (primeStatus == true) {
            System.out.println(num + " is prime");
        } else {
            System.out.println(num + " is not prime");
        }
    }
}
