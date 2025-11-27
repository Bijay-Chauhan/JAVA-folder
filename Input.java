//program in multiplication of two number in java

//input
// Enter first number: 10
// Enter second number: 5
//output
// The product is: 50

//import util package...
import java.util.*;
public class Input {
    public static void main(String args[]){
        //input two numbers...
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        int product = a * b;
        System.out.println("The product is: "+product);
    }
}