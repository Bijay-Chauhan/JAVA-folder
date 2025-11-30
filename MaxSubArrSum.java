//write a program to find the maximum subarray sum in the given array
// arr = {1, -2, 6, -1, 3};
//output
//The maximum subArray sum is: 8

import java.util.*;
public class MaxSubArrSum {
    public static int maxSubArrSum(int arr[]) {
        int n = arr.length;
        int maxSum = 0;
        int currSum = 0;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int arr[] = {1, -2, 6, -1, 3};
        int maxSum = maxSubArrSum(arr);
        System.out.println("The maximum subarray sum is: "+maxSum);
    }
}