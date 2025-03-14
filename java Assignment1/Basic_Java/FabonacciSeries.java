import java.util.Scanner;

public class FabonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the limit:");
        Scanner sc=new Scanner(System.in);
        int lim=sc.nextInt();

        int a=0,b=1;
        System.out.print("fabi Seeries:"+a);
        while (b<=lim) {
            System.out.print(" "+b);
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
