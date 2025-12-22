// Qn. Write a program to print the Binary String of size N without consecutive ones...

// example - 1 :
// Enter a number: 3
// [000, 001, 010, 100, 101]

// example - 2 :
// Enter a number:5
// [00000, 00001, 00010, 00100, 00101, 01000, 01001, 01010, 10000, 10001, 10010, 10100, 10101]



import java.util.Scanner;
public class PrintBinString {
    public static void printBinary(int n, int lastStr, String str) {

        if(n == 0) {
            System.out.println(str);
            return;
        }

        printBinary(n-1, 0, str+"0");
        if(lastStr == 0) {
            printBinary(n-1, 1, str+"1");
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        //function call...
        printBinary(n, 0, "");
    }
}