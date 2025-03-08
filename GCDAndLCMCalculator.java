import java.util.Scanner;;

class GCDAndLCMCalculator {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        // method to calculate the greatest common divisor
        int gcd = calculateGCD(number1, number2);

        // method to calculate the least common multiple
        int lcm = calculateLCM(number1, number2, gcd);

        System.out.println("GCD of " + number1 + " and " + number2 + " is: " + gcd);
        System.out.println("LCM of " + number1 + " and " + number2 + " is: " + lcm);

        input.close();
    }

    // Method to calculate the greatest common divisor
    public static int calculateGCD(int number1, int number2) {
        if(number2 == 0) {
            return number1;
        }

        return calculateGCD(number2, number1 % number2);
    }

    // Method to calculate the least common multiple
    public static int calculateLCM(int number1, int number2, int gcd) {
        return (number1 * number2) / gcd;
    }
}
