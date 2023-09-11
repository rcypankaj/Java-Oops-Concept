package staticExample;

public class InnerClasses {
    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Pankaj");
        Test b = new Test("Yadav");
        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(b);
    }
}
