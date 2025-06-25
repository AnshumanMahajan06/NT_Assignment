import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,23,4,65,4,3,2,6,8,9,10};
        System.out.println("Enter the number to search");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println(num+" is present at index "+i);
                break;
            }
        }
    }
}
