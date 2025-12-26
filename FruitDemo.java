// Aim of the program : Write a program in Java 
// having three classes Apple, Banana and Cherry. 
// Class Banana and Cherry are inherited from class Apple and each class 
// have their own member function show() . Using Dynamic Method Dispatch concept display 
// all the show() method of each class. 

// This is Apple class
// This is Banana class
// This is Cherry class


class Apple {
    void show(){
        System.out.println("This is Apple class");
    }
}
class Banana extends Apple {
    void show() {
        System.out.println("This is Banana class");
    }
}
class Cherry extends Apple {
    void show() {
        System.out.println("This is Cherry class");
    }
}
class FruitDemo {
    public static void main(String args[]) {
        Apple a;

        a = new Apple();
        a.show();

        a = new Banana();
        a.show();

        a = new Cherry();
        a.show();
    }
}