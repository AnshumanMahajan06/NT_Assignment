package Advance_topic;

public class ExceptionHandeleing {
    public static void main(String[] args) {
        try {
            int i = 10 / 0;

        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("I am going to execute in any Situation");
        }
    }
}
