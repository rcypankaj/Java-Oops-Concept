package staticExample;

public class Main {
    public static void main(String[] args) {
        Human pankaj = new Human(21, "pankaj", 22000, false);
        Human rahul = new Human(20, "rahil", 10000, true);
        System.out.println(pankaj.population);
        System.out.println(rahul.population);
    }
}
