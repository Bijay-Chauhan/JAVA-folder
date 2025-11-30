//write a program to find the maximum profit from the given array
// prices[] = {7, 1, 5, 3, 6, 4};
// The maximum profit is: 5

import java.util.*;
public class BuyAndSellStock {
    public static int maximumProfit(int prices[]){
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        //calculate the maxprofit..
        for(int i=0; i<n; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
       int prices[] = {7, 1, 5, 3, 6, 4};
       int maxProfit = maximumProfit(prices);
       System.out.println("The maximum profit is: "+ maxProfit);
    }
}