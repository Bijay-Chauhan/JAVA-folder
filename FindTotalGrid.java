//program to find the total number of ways to reach from (0, 0) to (m - 1, n - 1) in 
// MXN grid allowed to moves: right and down

// Enter your row number: 
// 3
// Enter your column number: 
// 3
// Total grid is: 6

import java.util.Scanner;
public class FindTotalGrid {
    public static int factorial(int n) {
        if(n == 1 || n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static int gridWays(int m, int n){
        int totalFact = factorial(m + n - 2);

        int nm1Fact = factorial(n - 1);
        int mm1Fact = factorial(m - 1);

        int total = totalFact / ( nm1Fact * mm1Fact );
        return total;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row number: ");
        int m = sc.nextInt();

        System.out.println("Enter your column number: ");
        int n = sc.nextInt();
        
        int total = gridWays(m, n);
        System.out.println("Total grid is: " + total);
    }
}