import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Think of a number between 1 - 100 and I will guess it");

        int number = randomNumber(1, 100);
        int guessCount = 0;

        int start = 1;
        int end = 100;

        while(true) {
            guessCount++;
            System.out.print("Is the number " + number + " correct? ");
            String feedback = input.nextLine();

            if(feedback.equals("correct")) {
                System.out.println("The number is " + number);
                System.out.println("The computer guessed the number in " + guessCount + " tries");
                break;
            } else if(feedback.equals("greater")) {
                start = number+1;
                number = randomNumber(start, end);
            } else if(feedback.equals("lesser")) {
                end = number-1;
                number = randomNumber(start, end);
            }
        }
    }

    // Method to generate a random number
    public static int randomNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(start, end);
    }
}
