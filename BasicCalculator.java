import java.util.Scanner;

class BasicCalculator {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.print("Enter the operation: ");
        char operation = input.next().charAt(0);

        // Method to perform basic mathematical operations
        if(operation == '+') {
            System.out.println("Addition of " + number1 + " and " + number2 + " is: " + add(number1, number2));
        } else if(operation == '-') {
            System.out.println("Subtraction of " + number1 + " and " + number2 + " is: " + subtract(number1, number2));
        } else if(operation == '*') {
            System.out.println("Multiplication of " + number1 + " and " + number2 + " is: " + multiply(number1, number2));
        } else if(operation == '/') {
            System.out.println("Division of " + number1 + " and " + number2 + " is: " + divide(number1, number2));
        } else {
            System.out.println("Invalid operation");
        }

        input.close();
    }

    // Method to perform addition of two numbers
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    // Method to perform subtraction of two numbers
    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    // Method to perform multiplication of two numbers
    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    // Method to perform division of two number
    public static double divide(double number1, double number2) {
        if(number2 == 0) {
            System.out.println("Cannot divide by zero");
            System.exit(0);
        }
        return number1 / number2;
    }
}
