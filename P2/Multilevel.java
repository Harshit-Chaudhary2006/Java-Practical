
class Person {
    String name = "Rahul";

    void showName() {
        System.out.println("Name: " + name);
    }
}

class Employee extends Person {
    int salary = 30000;

    void showSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department = "IT";

    void showDepartment() {
        System.out.println("Department: " + department);
    }

    public static void Multilevel(String[] args) {
        Manager m = new Manager();

        m.showName();
        m.showSalary();
        m.showDepartment();
    }
}

