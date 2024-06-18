package Array;
import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements to array: ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        
        Set<Integer> hash_set = new HashSet<>();
        for(int i : arr){
            hash_set.add(i);
        }
        int[] result = new int[hash_set.size()];
        
        int index = 0;
        for(Integer value : hash_set){
            result[index++] = value;
        }
        System.out.println("Array after removing duplicates: "+ Arrays.toString(result));
    }
}
