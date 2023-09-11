package packages;

public class Student {
    public static void main(String[] args) {
        A obj = new A("Pankaj");
        System.out.println(obj);
//        for (int i = 0; i <= 100000; i++) {
//            obj = new A("Pankaj");
//        }
    }
}

class A {
    final int num = 10;
    String name;
    public A(String name) {
        this.name = name;
    }
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}