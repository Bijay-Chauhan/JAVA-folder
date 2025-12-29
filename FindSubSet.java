// Program to print the all subset of the String which string taking from the user:

// example:-1
// Enter a String: abc
// The all subsets are:
// [abc, ab, ac, a, bc, b, c]

// example:-2
// Enter a String: abcd
// The all subsets are:
// [abcd, abc, abd, ab, acd, ac, ad, a, bcd, bc, bd, b, cd, c, d]



import java.util.Scanner;
public class FindSubSet {

    public static void findAllSubset(String str, String ans, int i){
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        findAllSubset(str, ans + str.charAt(i), i+1);
        findAllSubset(str, ans, i+1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        findAllSubset(str, "", 0);
    }
}