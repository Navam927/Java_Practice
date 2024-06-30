package Array;
import java.util.*;

public class BestTimeToBuyAndSellStock {

    public static int getMax(ArrayList<Integer> arr){
        int max = arr.get(0);
        for(int i = 0; i < arr.size(); i++){
            if(max < arr.get(i)){
                max = arr.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total days: ");
        int n = sc.nextInt();
        int prices[] = new int[n];
        System.out.println("Enter prices: ");

        for(int i = 0; i < prices.length; i++){
            prices[i] = sc.nextInt();
        }
        sc.close();

        ArrayList<Integer> al = new ArrayList<>();
        
        System.out.println("Prices: ");
        for(int i = 0; i < prices.length; i++){
            System.out.print(prices[i]+" ");
        }
        System.out.println();

        int day = 0;
        while(day <= prices.length-2){
            int maxProfit = 0;
            int profit = 0;
            System.out.println("Day: "+day);

            for(int i = day; i < prices.length; i++){
                profit = prices[i] - prices[day];
                System.out.println("Cost Price:  "+prices[day]+" Selling Price: "+prices[i]+" Profit: "+profit);
                if(maxProfit < profit){
                    maxProfit = profit;
                }
            }
            System.out.println("Day: "+day+" CostPrice: "+prices[day]+" Max Profit: "+maxProfit);
            if(maxProfit > 0){
                al.add(maxProfit);
            }
            else{
                al.add(0);
            }
            day++;
        }
        System.out.println(al);
        System.out.println("Best profit -> "+getMax(al));
    }
}
