import java.util.HashSet;

public class UnionArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        HashSet<Integer> union = new HashSet<>();

        for (int i : arr1) {
            union.add(i);
        }

        for (int i : arr2) {
            union.add(i);
        }

        System.out.println("Union of Arrays:");
        for (int i : union) {
            System.out.print(i + " ");
        }
    }
}