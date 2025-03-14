public class Searching {
    

 public static void Bubble(int arr[], int len) {

    for (int i = 0; i < len; i++) {
        for (int j = 0; j < len - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}

public static void selection(int arr[], int len) {

    for (int i = 0; i < len; i++) {
        int greater = i;
        for (int j = i; j < len; j++) {
            if (arr[j] < arr[greater]) {
                greater = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[greater];
        arr[greater] = temp;
    }
}

public static void printFun(int arr[]) {
    for (int ele : arr) {
        System.out.print(ele + " ");
    }
    System.out.println();

}

public static void main(String[] args) {
    int arr[] = { 1, 12, 34, 5, 34, 7, 8, 56, 11 };
    int len = arr.length;
    printFun(arr);
    Bubble(arr, len);
    printFun(arr);
    selection(arr, len);
    printFun(arr);
}


    
}
