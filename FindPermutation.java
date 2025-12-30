//Program to find and print the permutation of the string from the user.

// example:-1
// Enter a string: abc
// permutations are:-
// [abc, acb, bac, bca, cab, cba]



import java.util.Scanner;
public class FindPermutation {

    public static void printPermutation(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
        }

        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);

            String newStr = str.substring(0, i) + str.substring(i+1);

            printPermutation(newStr, ans + curr);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        
        printPermutation(str, "");
    }
}