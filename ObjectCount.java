// Qn. Write a program to count the number of object

// Enter a number to how many object will be created: 5
// the number of object created is: 5

import java.util.Scanner;
public class ObjectCount {
    
    static int count = 0;

    ObjectCount() {
        count++;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to how many object will be created: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            new ObjectCount();
        }

        System.out.println("the number of object created is: "+ count);
    }
}