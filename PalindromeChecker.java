import java.util.Scanner;

class PalindromeChecker {
    // Main method
    public static void main(String[] args) {
        // Method to take string input from user
        String str = getPalindrome();

        // Method to check if a given string is palindrome
        boolean result = isPalindrome(str);

        // Method to display the result
        printResult(str, result);
    }

    // method to take string input from user
    public static String getPalindrome() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        return str;
    }

    // Method to check if a given string is palindrome
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    // Method to display the result 
    public static void printResult(String s, boolean result) {
        if(result) {
            System.out.println(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome");
        }
    }
}
