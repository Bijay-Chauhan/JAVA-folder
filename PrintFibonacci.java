// WAP To print the fibonacci number 

//example
// Enter a number: 8
// The factorial no is: 21

import java.util.*;
class PrintFibonacci {
    public static int printFib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fib1 = printFib(n-1);
        int fib2 = printFib(n-2);
        int fibn = fib1 + fib2;
        return fibn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fib = printFib(n);
        System.out.println("The factorial no is: "+ fib);
    }
}