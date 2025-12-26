// Aim of the program :  Write a program in Java to 
// create a class Rectangle having data members 	
// length and breadth and three methods called read, 
// calculate and display to read the values of length and breadth, calculate
// the area and perimeter of the rectangle and display the result respectively.

//length = 5;
//breadth = 4;
// Area = 20.0
// Perimeter = 18.0

class Rectangle {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    void area() {
        System.out.println("Area = " + (length * breadth));
    }

    void perimeter() {
        System.out.println("Perimeter = " + (2 * (length + breadth)));
    }
}

class RectangleDemo {
    public static void main(String args[]) {
        Rectangle r = new Rectangle(5, 4);
        r.area();
        r.perimeter();
    }
}
