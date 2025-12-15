import java.util.*;
class PrintFactorial {
    public static int printFact(int n){
        if(n == 0){
            return 1;
        }
        // int fnm1 = printFact(n-1);
        int fn = n * printFact(n-1);
        return fn;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = printFact(n);
        System.out.println("The factorial no is: "+ fact);
    }
}