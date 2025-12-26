// Aim of the program :  Write a program in Java to create a class Rectangle 
// having data members length and breadth and three methods called read, 
// calculate and display to read the values of length and breadth,  
// calculate the area and perimeter of the rectangle and display the result respectively.

//example.....................
// Enter the length: 
// 2
// Enter the breath: 
// 2
// the area is: 4
// the perimeter is: 8

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length: ");
        length = sc.nextInt();

        System.out.println("Enter the breath: ");
        breadth = sc.nextInt();
    }

    void area() {
        int calArea = length * breadth;
        System.out.println("the area is: "+ calArea);
    }

    void perimeter() {
        int calPerimeter = 2 * (length + breadth);
        System.out.println("the perimeter is: "+ calPerimeter);
    }
}

class CalRectangle {
    public static void main(String args[]) {
        Rectangle r = new Rectangle();
        r.read();
        r.area();
        r.perimeter();
    }
}