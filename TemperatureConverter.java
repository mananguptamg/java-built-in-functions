import java.util.Scanner;

class TemperatureConverter {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Convert Celsius to Fahrenheit");
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Method to convert from celsius to fahrenheit
        double fahrenheitTemp = celsiusToFahrenheit(celsius);

        System.out.printf("Temperature in Fahrenheit: %.2f\n" , fahrenheitTemp);

        System.out.println("Convert Fahrenheit to Celsius");
        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Method to convert from fahrenheit to celsius
        double celsiusTemp = fahrenheitToCelsius(fahrenheit);

        System.out.printf("Temperature in Celsius: %.2f\n" , celsiusTemp);
    }
    
    // Method to convert from celsius to fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Method to convert from fahrenheit to celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
