//print the sentence in n time taking the number from user...

// input
// 5
// output
// Hello world
// Hello world
// Hello world
// Hello world
// Hello world

import java.util.*;
public class WhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        while(num > i){
            System.out.println("Hello world");
            i++;
        }
    }
}