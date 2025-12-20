// Qn.1 Write a program to find how many ways to placed the tiles in 2x1 

//example-1
// Enter a tiling number: 
// 4
// The totle tiling placed ways is: 5
//example-2
// Enter a tiling number: 
// 2
// The totle tiling placed ways is: 2

import java.util.Scanner;
public class TotalTiling {
    public static int tiling(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        int fnm1 = tiling(n-1);
        int fnm2 = tiling(n-2);
        int total = fnm1 + fnm2;

        return total;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a tiling number: ");
        int n = sc.nextInt();

        int total = tiling(n);
        System.out.println("The totle tiling placed ways is: " + total);
    }
}