//program to find the total number of ways to reach from (0, 0) to (m - 1, n - 1) in 
// MXN grid allowed to moves: right and down using recursion based

// Enter your row number: 
// 3
// Enter your column number: 
// 3
// Total grid is: 6

import java.util.Scanner;
public class FindTotalGridWays {
    public static int gridWays(int row, int col, int m, int n){
        if(row == m - 1 && col == n - 1){
            return 1;
        }else if(row == m || col == n){
            return 0;
        }
        int way1 = gridWays(row + 1, col, m, n);

        int way2 = gridWays(row, col + 1, m, n);

        int total = way1 + way2;
        return total;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your row number: ");
        int m = sc.nextInt();

        System.out.println("Enter your column number: ");
        int n = sc.nextInt();
        
        int total = gridWays(0, 0, m, n);
        System.out.println("Total grid is: " + total);
    }
}