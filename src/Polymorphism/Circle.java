package Polymorphism;

public class Circle extends Shapes{
    @Override // This is called annotation
    void area () {
        System.out.println("Area of circle is pir * r * r");
    }
}
