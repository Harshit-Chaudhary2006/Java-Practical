class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {

    double calculatePay() {
        return 2000;
    }
}

class Manager extends Employee {
   @Override
    double calculatePay() {
        return 5000;
    }
}

class Developer extends Employee {
   @Override
    double calculatePay() {
        return 3500;
    }
}

class Method {

    public static void main(String[] args) {
      System.out.println(" METHOD OVERLOADING ");
        Calculator c = new Calculator();
   
      System.out.println("Addition of two int: " + c.add(10, 20));
      System.out.println("Addition of three int: " + c.add(10, 20, 30));
      System.out.println("Addition of two numbers: " + c.add(5.5, 4.5));

      System.out.println("\n METHOD OVERRIDING ");
       Employee e;
       e = new Manager();
        System.out.println("Manager Pay: " + e.calculatePay());

       e = new Developer();
        System.out.println("Developer Pay: " + e.calculatePay());
    }
}

