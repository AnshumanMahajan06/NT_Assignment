import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        if(num%2==0){
            System.out.println(num+" is an even number");
        }
        else if(num%2!=0){
            System.out.println(num+" is an Odd number");
        }
    }
}
