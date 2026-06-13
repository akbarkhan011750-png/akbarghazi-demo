public class ArmstrongInRange {
    public static void main(String[] args) {
        int start = 1;
        int end = 1000;

        for (int num = start; num <= end; num++) {
            int originalNum = num;
            int temp = num;
            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if (sum == originalNum) {
                System.out.print(num + " ");
            }
        }
    }
}