import java.util.Scanner;

class FibonacciSeriesGenerator {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = input.nextInt();

        // Method to generate the fibonacci sequence and display
        generateFibonacci(terms);
    }

    // Method to generate the fibonacci sequence and display
    public static void generateFibonacci(int terms) {
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Sequence: " + num1 + " " + num2);

        for(int i = 2; i < terms; i++) {
            int num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
