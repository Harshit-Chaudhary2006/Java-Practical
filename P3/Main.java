interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class AllInOnePrinter implements Printable, Scannable {
  @Override
    public void print() {
        System.out.println("Printer is printing the document.");
    }
  @Override
    public void scan() {
        System.out.println("Printer is scanning the document.");
    }
}

class Machine {
   void start() {
        System.out.println("Machine is starting.");
    }
}

class SmartPrinter extends Machine implements Printable, Scannable {
  @Override
    public void print() {
        System.out.println("Smart Printer is printing.");
    }
  @Override
    public void scan() {
        System.out.println("Smart Printer is scanning.");
    }
}
class Hybrid  {
 public static void main(String[] args) {
        System.out.println(" Multiple Inheritance Using Interfaces ");
           AllInOnePrinter printer = new AllInOnePrinter();
           printer.print();
           printer.scan();

        System.out.println("\n Hybrid Inheritance Using Interfaces ");
          SmartPrinter smartPrinter = new SmartPrinter();

        smartPrinter.start();
        smartPrinter.print();
        smartPrinter.scan();
    }
}

