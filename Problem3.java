import javax.swing.JOptionPane;

// Parent class
class Person {
    String name;
    Person(String n) {
        name = n;
    }
}

// Child class Employee
class EmployeeP3 extends Person {
    int id;
    EmployeeP3(String n, int i) {
        super(n);
        id = i;
    }
}

// Child class Salary
class Salary extends EmployeeP3 {
    double basic;

    Salary(String n, int i, double b) {
        super(n, i);
        basic = b;
    }

    double getHRA() {
        return basic * 0.2; // 20% of basic
    }

    double getTotalSalary() {
        return basic + getHRA();
    }

    void showDetails() {
        JOptionPane.showMessageDialog(null,
            "Name: " + name +
            "\nEmployee ID: " + id +
            "\nBasic Salary: " + String.format("%.2f", basic) +
            "\nHRA: " + String.format("%.2f", getHRA()) +
            "\nTotal Salary: " + String.format("%.2f", getTotalSalary()));
    }
}

public class Problem3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Name:");
        int id = Integer.parseInt(JOptionPane.showInputDialog("Enter Employee ID:"));
        double basic = Double.parseDouble(JOptionPane.showInputDialog("Enter Basic Salary:"));

        Salary s = new Salary(name, id, basic);
        s.showDetails();
    }
}
