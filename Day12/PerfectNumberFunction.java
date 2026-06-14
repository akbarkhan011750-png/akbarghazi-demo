import java.util.Scanner;

public class PerfectNumberFunction {

    // function to check perfect number
    static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPerfect(n)) {
            System.out.println(n + " is a Perfect number");
        } else {
            System.out.println(n + " is not a Perfect number");
        }

    }
}