// Qn. Program to print how many times you have Transfer the data from source to destination.


//example
// Enter a number to pass the source to destination : 3

// Transfer disk 1 from A to C
// Transfer disk 2 from A to B
// Transfer disk 1 from C to B
// Transfer disk 3 from A to C
// Transfer disk 1 from B to A
// Transfer disk 2 from B to C
// Transfer disk 1 from A to C

import java.util.Scanner;
public class TowerOfHenoi {
    public static void printTowerOfHenoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("Transfer disk "+ n + " from "+ src + " to " + dest );
            return;
        }
        printTowerOfHenoi(n-1, src, dest, helper);

        System.out.println("Transfer disk "+ n + " from "+ src + " to " + dest );

        printTowerOfHenoi(n-1, helper, src, dest);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to pass the source to destination : ");
        int n = sc.nextInt();

        printTowerOfHenoi(n, "A", "B", "C");
    }
}