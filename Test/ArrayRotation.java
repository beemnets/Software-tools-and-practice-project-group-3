import java.util.Arrays;

public class ArrayRotation {
    
    public static void rotateLeft(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }
    
    public static void rotateRight(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
         int[] arr2 = {1, 2, 3, 4, 5};
        int rotations = 2;
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        // Rotate left
        rotateLeft(arr, rotations);
        System.out.println("Array after left rotation: " + Arrays.toString(arr));
        
        // Rotate right
        rotateRight(arr2, rotations);
        System.out.println("Array after right rotation: " + Arrays.toString(arr2));
    }
}

