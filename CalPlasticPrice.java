// Q1. Aim of the program : 
// A Plastic manufacturer sells plastic in different shapes like 2D sheet and 3D box. 
// The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. 	
// Implement it in Java to calculate the cost of plastic as per the dimensions 
// given by the user where 3D inherits from 2D.

// Enter the length: 3
// Enter the width: 2
// total Cost of 2D sheet is : 240
// Enter the length: 3
// Enter the width: 2
// Enter the height: 1
// total Cost of 3D sheet is : 360


import java.util.Scanner;
class Plastic2D {
    int length;
    int width;
    int cost;
    void get2D(int length, int width) {
        this.length = length;
        this.width = width;
        cost = length * width * 40;
    }
    void showCost() {
        System.out.println("total Cost of 2D sheet is : "+ cost);
    }
}
class Plastic3D extends Plastic2D {
    int height;
    void get3D(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
        cost = length * width * height * 60;
    }
    void showCost(){
        System.out.println("total Cost of 3D sheet is : "+ cost);
    }
}
class CalPlasticPrice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Plastic2D p2 = new Plastic2D();

        System.out.println("Enter the length: ");
        int length = sc.nextInt();

        System.out.println("Enter the width: ");
        int width = sc.nextInt();

        p2.get2D(length, width);
        p2.showCost();

        Plastic3D p3 = new Plastic3D();

        System.out.println("Enter the length: ");
        length = sc.nextInt();

        System.out.println("Enter the width: ");
        width = sc.nextInt();

        System.out.println("Enter the height: ");
        int height = sc.nextInt();

        p3.get3D(length, width, height);
        p3.showCost();
    }
}