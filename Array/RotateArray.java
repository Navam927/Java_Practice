package Array;
import java.util.*;

public class RotateArray {

    public static void rev(int arr[], int s, int e) {
        int start = s;
        int end = e;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index to rotate array around: ");
        int k = sc.nextInt();
        sc.close();

        // Reverse first k elements
        rev(arr, 0, k - 1);

        // Reverse remaining part (from k to n-1)
        rev(arr, k, n - 1);

        // Reverse entire array (to get final order)
        rev(arr, 0, n - 1);

        print(arr);
    }
}

