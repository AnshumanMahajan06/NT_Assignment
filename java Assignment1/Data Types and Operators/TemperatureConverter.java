import java.util.*;
public class TemperatureConverter {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();
        
        double temperature, convertedTemperature;
        
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                convertedTemperature = (temperature * 9 / 5) + 32;
                System.out.printf("Temperature in Fahrenheit: %.2f°F\n", convertedTemperature);
                break;
            
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                convertedTemperature = (temperature - 32) * 5 / 9;
                System.out.printf("Temperature in Celsius: %.2f°C\n", convertedTemperature);
                break;
            
            default:
                System.out.println("Invalid choice!");
        }
    
    }
}

