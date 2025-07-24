class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}

public class LSPExample {
    public static void main(String[] args) {
        Bird bird = new Sparrow();
        bird.fly();
    }
}
