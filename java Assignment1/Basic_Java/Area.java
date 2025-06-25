import java.util.*;

public class Area {
    public static double circle() {
        System.out.println("Enter the radius of circle");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        return 3.14 * r * r;
    }

    public static double rectangle() {
        System.out.println("Enter the lenght of rectangle");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        System.out.println("Enter the width of rectangle");
        int w = sc.nextInt();
        return l * w;
    }

    public static double triangle() {
        System.out.println("Enter the base of triangle");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println("Enter the height of triangle");
        int h = sc.nextInt();
        return 0.5 * b * h;
    }

    public static void main(String args[]) {
        System.out.println("Enter your choice number to calculate area");
        System.out.println("Enter 1 to calculate area of circle \nEnter 2 to calculate area of" +
                "rectangle \nEnter 3 to calculate area of triangle");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("The area of circle is: " + circle());
                break;
            case 2:
                System.out.println("The area of rectangle is: " + rectangle());
                break;
            case 3:
                System.out.println("The area of triangle is: " + triangle());
                break;
            default:
                System.out.println("Entre the choise among 1,2 or 3");
        }
    }
}