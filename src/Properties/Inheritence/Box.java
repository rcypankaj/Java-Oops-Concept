package Properties.Inheritence;

public class Box {
    int l;
    int b, h;
    Box() {
        this.h = 1;
        this.l = 2;
        this.b = 3;
    }

    public Box(int data) {
        this.l = data;
        this.b = data;
        this.h = data;
    }

    Box(int l, int b, int h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box old) {
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public void information() {
        System.out.println("Running the box");
    }

}
