//program for reverse of given number in java

//input....
// Enter number: 
// 99543

// output....
// 34599

//import util package...
import java.util.*;
public class ReverseOfNum {
    public static void main(String args[]){
        //input numbers...
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int rev = 0;
        while(num > 0){
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num/=10;
        }
        System.out.println(rev);
    }
}