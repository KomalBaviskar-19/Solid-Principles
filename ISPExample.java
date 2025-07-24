interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class SimplePrinter implements Printer {
    public void print() {
        System.out.println("Printing...");
    }
}

class AllInOnePrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }
}

public class ISPExample {
    public static void main(String[] args) {
        Printer p = new SimplePrinter();
        p.print();

        AllInOnePrinter aio = new AllInOnePrinter();
        aio.print();
        aio.scan();
    }
}
