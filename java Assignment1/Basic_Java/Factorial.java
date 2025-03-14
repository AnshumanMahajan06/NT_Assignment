import java.util.Scanner;

public class Factorial {
    public static int fact(int num) {
        if (num <= 1)
            return 1;

        else
            return num * fact(num - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The factorial of " + num + " is: " + fact(num));
    }
}
