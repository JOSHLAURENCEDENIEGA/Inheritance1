import javax.swing.JOptionPane;

// Parent class Product
class Product {
    String name;    // product name
    double price;   // base price

    // Constructor for Product
    Product(String n, double p) {
        name = n;   // initialize product name
        price = p;  // initialize product price
    }

    // Method to return final price (for normal products)
    double getFinalPrice() {
        return price;
    }
}

// Child class Electronics extends Product
class Electronics extends Product {
    double warrantyFee;   // additional warranty fee

    // Constructor for Electronics
    Electronics(String n, double p, double w) {
        super(n, p);      // call parent (Product) constructor
        warrantyFee = w;  // initialize warranty fee
    }

    // Overridden method to calculate final price with warranty
    double getFinalPrice() {
        return price + warrantyFee;
    }
}

// Child class Clothes extends Product
class Clothes extends Product {
    double discount;   // discount for clothes

    // Constructor for Clothes
    Clothes(String n, double p, double d) {
        super(n, p);     // call parent (Product) constructor
        discount = d;    // initialize discount
    }

    // Overridden method to calculate final price with discount
    double getFinalPrice() {
        return price - discount;
    }
}

// Main class
public class Problem2 {
    public static void main(String[] args) {
        // Ask user to input product name
        String name = JOptionPane.showInputDialog("Enter product name:");

        // Ask user to input product base price
        double price = Double.parseDouble(JOptionPane.showInputDialog("Enter price:"));

        // Ask user if the product is electronics or clothes
        String type = JOptionPane.showInputDialog("Enter product type (electronics/clothes):");

        // If product is electronics
        if (type.equalsIgnoreCase("electronics")) {
            double warranty = Double.parseDouble(JOptionPane.showInputDialog("Enter warranty fee:"));
            Electronics e = new Electronics(name, price, warranty); // create Electronics object

            // Show the final price of electronics (price + warranty)
            JOptionPane.showMessageDialog(null,
                "Final price of electronic: " + String.format("%.2f", e.getFinalPrice()));
        } else {
            // If product is clothes
            double discount = Double.parseDouble(JOptionPane.showInputDialog("Enter discount:"));
            Clothes c = new Clothes(name, price, discount); // create Clothes object

            // Show the final price of clothes (price - discount)
            JOptionPane.showMessageDialog(null,
                "Final price of clothes: " + String.format("%.2f", c.getFinalPrice()));
        }
    }
}
