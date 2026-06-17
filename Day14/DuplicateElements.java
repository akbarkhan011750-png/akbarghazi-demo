import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        boolean found = false;

        for (int i = 0; i < n; i++) {
            int count = 1;

            // Skip already checked elements
            boolean alreadyChecked = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyChecked = true;
                    break;
                }
            }
            if (alreadyChecked) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate elements found");
        }

    }
}