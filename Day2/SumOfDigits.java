import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num != 0) {
            sum += num % 10;  // Get the last digit
            num /= 10;        // Remove the last digit
        }

        System.out.println("Sum of digits = " + sum);

        sc.close();
    }
}