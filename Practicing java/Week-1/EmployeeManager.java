// 🧩 Problem 2: Method Overriding

// Problem Statement:
// Create a class Employee with a method displayInfo().
// Create a subclass Manager that overrides this method to show additional details like team size and department.

class Employees {
    String name;
    int id;

    public Employees(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class Manager extends Employees {
    String department;
    int teamSize;

    public Manager(String name, int id, String department, int teamSize) {
        super(name, id);
        this.department = department;
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class EmployeeManager { 
    public static void main(String[] args) {
        Employees obj = new Employees("srikanth", 1);
        Manager obj1 = new Manager("Shashidhar", 2, "IT", 5);
        Employees obj2 = new Manager("sridhar", 3, "IT", 10);

        obj.displayInfo();
        System.out.println();
        obj1.displayInfo();
        System.out.println();
        obj2.displayInfo();
    }
}