import java.util.Scanner;

class FactorialOfNumber {
    // Main method
    public static void main(String[] args) {
        // Method to take number input from user
        int number = getNumber();

        // Method to calculate factorial of a number using recursion
        int result = factorial(number);

        // Method to print the factorial of a number
        printFactorial(number, result);
    }

    // Method to take number input from user
    public static int getNumber() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        input.close();
        return number;
    }

    // Method to calculate factorial of a number using recursion
    public static int factorial(int number) {
        if(number == 0) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    // Method to print the factorial of a number
    public static void printFactorial(int number, int result) {
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
