package Array;
import java.util.*;

// Find minimum and maximum element in an array

public class MinMax {

    public static int FindMinimum(int arr[]){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static int FindMaximum(int arr[]){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter size of array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter "+n+" elements ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int min = FindMinimum(arr);
        int max = FindMaximum(arr);
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
        
    }
}
