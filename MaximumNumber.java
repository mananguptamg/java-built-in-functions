import java.util.Scanner;

class MaximumNumber {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        // Method to find the maximum of three numbers
        int max = maxNumber(num1, num2, num3);

        // Display the result
        System.out.println("The maximum number among " + num1 + ", " + num2 + " and " + num3 + " is: " + max);
    }

    // Method to find the maximum number among three numbers
    public static int maxNumber(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }
}
