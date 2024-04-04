import java.util.HashSet;
import java.util.Set;

public class ArraySubset {

    public static boolean isSubset(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();

        // Add elements of arr1 to set
        for (int num : arr1) {
            set.add(num);
        }

        // Check if all elements of arr2 are present in set
        for (int num : arr2) {
            if (!set.contains(num)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4};

        System.out.println("Array 1: " + arrayToString(arr1));
        System.out.println("Array 2: " + arrayToString(arr2));

        if (isSubset(arr2, arr1)) {
            System.out.println("Array 2 is a subset of Array 1.");
        } else {
            System.out.println("Array 2 is not a subset of Array 1.");
        }
    }

    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

