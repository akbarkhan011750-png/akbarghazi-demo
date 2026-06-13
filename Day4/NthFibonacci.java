public class NthFibonacci {
    public static void main(String[] args) {
        int n = 8; // Find the 8th Fibonacci term

        int a = 0, b = 1;

        if (n == 1) {
            System.out.println(a);
        } else if (n == 2) {
            System.out.println(b);
        } else {
            for (int i = 3; i <= n; i++) {
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println("The " + n + "th Fibonacci term is " + b);
        }
    }
}