// 🧩 Problem Statement
// Create two Java classes: Student and Employee.

// Each class should include the following Fields:
// name, id, department, salary
// A constructor to initialize the fields
// Encapsulate the fields using private access modifier
// Provide getter and setter methods
// Create a displayInfo() method to print object details
// Override toString() method to return a string representation of the object

class Student {
    private String name;
    private int id;
    private String department;
    private double salary;

    public Student(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public String toString() {
        return "Student{name='" + name + "', id=" + id +
                ", department='" + department + "', salary=" + salary + "}";

    }
}

class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    public Employee(String name, int id, String department, double salary) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display info
    public void displayInfo() {
        System.out.println("Employee Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public String toString() {
        return "Employee{name='" + name + "', id=" + id +
                ", department='" + department + "', salary=" + salary + "}";
    }
}

public class StudentAndEmployee {
    public static void main(String[] args) {
        Student student = new Student("Srikanth", 1, "Computer Science", 15000.0);
        Employee employee = new Employee("Shashidhar", 3, "HR", 80000);

        student.displayInfo();
        System.out.println(student);

        System.out.println();

        employee.displayInfo();
        System.out.println(employee);
    }
}





