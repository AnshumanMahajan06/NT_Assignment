public class AverageOfArray {

   

        public static void main(String[] args) {
            int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            double sum = 0;
            for (int i : arr) {
                sum += i;
            }
            System.out.println("The average of array is :" + sum / arr.length);
        }
    }


