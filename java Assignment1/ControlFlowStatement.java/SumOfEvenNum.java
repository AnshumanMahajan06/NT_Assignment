
public class SumOfEvenNum { //2 + 4 + 6 + 8 + 10 = 30.
    public static void main(String[] args) {
        int i=0;
        int sum=0;
        while (i<=10) {
            if(i%2==0){
                sum+=i;
            }
            i++;
        }
        System.out.println("The sum of even number upto 10 is: "+sum);
    }
}
