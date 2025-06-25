
import java.util.Scanner;

public class TablePrinting {
    public static void main(String[] args) {
        System.out.println("Ente the number to print the table");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(number+" * "+i+" = "+number*i);
        }
    }
}
