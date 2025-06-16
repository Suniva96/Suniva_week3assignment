// File: EmployeeSystem.java

abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public abstract double calculateSalary(); 
}

class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + bonus;
    }
}

class Developer extends Employee {
    private int overtimeHours;
    private double overtimeRate;

    public Developer(String name, int id, double baseSalary, int overtimeHours, double overtimeRate) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
        this.overtimeRate = overtimeRate;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeRate() {
        return overtimeRate;
    }

    public void setOvertimeRate(double overtimeRate) {
        this.overtimeRate = overtimeRate;
    }

    @Override
    public double calculateSalary() {
        return getSalary() + (overtimeHours * overtimeRate);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new Manager("Hari", 107, 5002039, 10000);
        employees[1] = new Developer("Sita", 102, 40500, 10, 500);

        for (Employee emp : employees) {
            System.out.println("Employee Name: " + emp.getName());
            System.out.println("Employee ID: " + emp.getId());
            System.out.println("Calculated Salary: Rs. " + emp.calculateSalary());
        }
    }
}
