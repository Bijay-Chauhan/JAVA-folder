//input the datails of student and print the details 

// Enter your name: 
// Bijay Chauhan
// Enter your roll No: 
// 24
// Enter your section: 
// 3
// Enter your Branch: 
// cse

// Your name is: Bijay Chauhan
// Roll No is: 24
// Section is: 3
// Branch is: cse

import java.util.*;

public class SudentDetail {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your roll No: ");
        int roll = sc.nextInt();

        System.out.println("Enter your section: ");
        int section = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter your Branch: ");
        String branch = sc.nextLine();

        // output..
        System.out.println("\nYour name is: " + name 
                + "\nRoll No is: " + roll 
                + "\nSection is: " + section 
                + "\nBranch is: " + branch);
    }
}
