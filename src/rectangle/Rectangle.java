package rectangle;

public class Rectangle {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() {}

    public void printSide() {
        System.out.println("Length side a = " + sideA);
        System.out.println("Width side b = " + sideB);
    }

    public int area() {
        return sideA * sideB;
    }

    public int perimeter() {
        return sideA * 2 + sideB * 2;
    }

    public static void main(String[] args) {

        Rectangle rec = new Rectangle(4, 3);
        rec.printSide();

        System.out.println("\nPerimeter rectangle P = " + rec.perimeter());
        System.out.println("Area rectangle S = " + rec.area());
    }
}
