package SingletonClass;

public class Singleton  {
    String name;
//    private Singleton (name) {
//        this.name = name;
//    }
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
