package Array;
import java.util.*;

public class FrequencyCount {
  public static void main(String args[]){
    HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter size of array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter elements to array: ");

    for(int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }

    sc.close();

    for(int i=0; i<arr.length; i++){
        if(h.containsKey(arr[i])){
            h.put(arr[i], h.get(arr[i]) + 1);
        } else {
            h.put(arr[i], 1);
        }
    }
    System.out.println(h);
}
}
