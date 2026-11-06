class Employee{
    String name;
    double salary;
    
    static int employeeCount = 0;
    Employee(){
        this("Unknown", 0.0);
        System.out.println("Default constructor called.");
    }
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
        employeeCount++;
        System.out.println("Parameterized constructor called.");
    }
    void display(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: Rs. " + salary);
        System.out.println();
    }
    static void displayEmployeeCount(){
        System.out.println("Total Employees: " + employeeCount);
    }
}
public class Member {
    public static void main(String[] args) {
      System.out.println("Constructor Chaining");
        Employee e1 = new Employee();
        e1.display();
      System.out.println("Parametrized Construtor");
        Employee e2 = new Employee("Rahul", 25000);
        e2.display();
        Employee e3 = new Employee("Aman", 30000);
        e3.display();

        System.out.println("Static Member");
        Employee.displayEmployeeCount();
    }
}

