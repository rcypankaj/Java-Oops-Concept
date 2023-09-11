package Polymorphism;

public class Main extends Shapes{
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Shapes shape1 = new Square();
        shape1.area();
    }
}
