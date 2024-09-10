import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = convertCelsiusToFahrenheit(celsius);
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
        
        scanner.close();
    }

    static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
