import java.util.Scanner;

public class PalindromeFunction {

    // function to check palindrome
    static boolean isPalindrome(int n) {
        int original = n;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return original == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome number");
        } else {
            System.out.println(n + " is not a Palindrome number");
        }

    }
}