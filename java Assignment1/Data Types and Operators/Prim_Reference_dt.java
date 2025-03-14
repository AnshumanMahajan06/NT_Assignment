
public class Prim_Reference_dt {
    public static void main(String[] args) {

        // Primitive Data Type Example
        int x = 10;
        int y = x;
        y = 20;

        System.out.println("Primitive Types:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);

        // Reference Data Type Example
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = arr1;
        arr2[0] = 100;

        System.out.println("\nReference Types:");
        System.out.print("arr1: ");
        for (int i : arr1)
            System.out.print(i + " ");

        System.out.print("\narr2: ");
        for (int i : arr2)
            System.out.print(i + " ");

        // Primitive types (x and y) hold independent values — changing y doesn't affect x.
        // Reference types (arr1 and arr2) share the same memory reference — changing
        // arr2 affects arr1 because they both point to the same object in memory.
    }
}
