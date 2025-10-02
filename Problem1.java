import javax.swing.JOptionPane;

// Parent class Employee
class Employee {
    String name;           // Stores the name of the employee
    double baseSalary;     // Stores the base salary

    // Constructor for Employee
    Employee(String n, double s) {
        name = n;          // Initialize employee name
        baseSalary = s;    // Initialize base salary
    }

    // Method to return salary (for normal employees)
    double getSalary() {
        return baseSalary;
    }
}

// Child class Manager that extends Employee
class Manager extends Employee {
    double bonus;   // Stores the manager's bonus

    // Constructor for Manager
    Manager(String n, double s, double b) {
        super(n, s);  // Calls the parent (Employee) constructor
        bonus = b;    // Initialize bonus
    }

    // Method overriding: calculates total salary for Manager
    double getSalary() {
        return baseSalary + bonus;
    }
}

// Main class
public class Problem1 {
    public static void main(String[] args) {
        // Input employee name
        String name = JOptionPane.showInputDialog("Enter employee name:");

        // Input base salary
        double salary = Double.parseDouble(JOptionPane.showInputDialog("Enter base salary:"));

        // Ask if employee is a manager
        String ans = JOptionPane.showInputDialog("Is the employee a manager? (yes/no):");

        // If employee is a manager, ask for bonus and calculate salary
        if (ans.equalsIgnoreCase("yes")) {
            double bonus = Double.parseDouble(JOptionPane.showInputDialog("Enter bonus:"));
            Manager m = new Manager(name, salary, bonus); // Create Manager object

            // Show total salary for manager
            JOptionPane.showMessageDialog(null,
                "Total Salary of Manager " + name + ": " + String.format("%.2f", m.getSalary()));
        } else {
            // If not a manager, create Employee object
            Employee e = new Employee(name, salary);

            // Show total salary for employee
            JOptionPane.showMessageDialog(null,
                "Total Salary of Employee " + name + ": " + String.format("%.2f", e.getSalary()));
        }
    }
}
