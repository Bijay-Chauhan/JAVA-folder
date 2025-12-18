// Enter a height: 
// 5
// Enter a width: 
// 2
// Enter a length: 
// 5
// the volume is: 50

import java.util.Scanner;

public class PrintVolume {

    class Box {
        int length;
        int width;
        int height;

        int volume() {
            return length*width*height;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a height: ");
        int height = sc.nextInt();

        System.out.println("Enter a width: ");
        int width = sc.nextInt();

        System.out.println("Enter a length: ");
        int length = sc.nextInt();

        Box b = new Box();

        b.length = length;
        b.width = width;
        b.height = height;

        int vol = b.volume();

        System.out.println("the volume is: "+ vol);
    }
}