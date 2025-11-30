// write a program to find the maximum traped water in the given height of the water in an array

// input 
// height = [4, 2, 0, 6, 3, 2, 5]
// output 
// maximum traped water is : 11

import java.util.*;
public class TrapedRainWater {
    public static int trapedWater(int height[]){
        
        int n = height.length;
        int leftMostBound[] = new int[n];
        int rightMostBound[] = new int[n];

        //calculate for left most boundary....
        leftMostBound[0] = height[0];
        for(int i=1; i<n; i++){
            leftMostBound[i] = Math.max(leftMostBound[i-1], height[i]);
        }

        //calculate for right most boundary....
        rightMostBound[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMostBound[i] = Math.max(rightMostBound[i+1], height[i]);
        }

        //calculate for maximum traped water...
        int maxTraped = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(rightMostBound[i], leftMostBound[i]);
            maxTraped += (waterLevel - height[i]);
        }
        return maxTraped;
    }

    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int total = trapedWater(height);
        System.out.println("Traped water is: "+total);
    }
}