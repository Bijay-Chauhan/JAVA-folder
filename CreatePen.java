public class CreatePen {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        Pen p2 = new Pen();

        p1.setColor("blue");
        System.out.println(p1.color);

        p1.setPrice(5);
        System.out.println(p1.price);

        p2.setColor("green");
        System.out.println(p2.color);

        p2.setPrice (100);
        System.out.println(p2.price);
    }
    static class Pen {
        int price;
        String color;
        void setColor(String newColor) {
            color = newColor;
        }
        void setPrice(int newPrice) {
            price = newPrice;
        }
    }
}