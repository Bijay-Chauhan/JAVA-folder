// WAP To print the power of a number

//example
// Enter X number: 
// 2
// Enter N number: 
// 5
// total is: 32

import java.util.*;
class CalPower {
    public static int calPow(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfCal = calPow(x, n/2);
        int halfPowsq = halfCal * halfCal;
        if(n%2 != 0){
            halfPowsq = x * halfPowsq;
        }
        return halfPowsq;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X number: ");
        int x = sc.nextInt();
        System.out.println("Enter N number: ");
        int n = sc.nextInt();
        int total = calPow(x, n);
        System.out.println("total is: "+ total);
    }
}