class Product {
     String name;
     double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: Rs. " + price);
    }
}

class Electronics extends Product {
    private int warrantyPeriod; 

    public Electronics(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}

class Clothing extends Product {
    private String size;
    private String material;

    public Clothing(String name, double price, String size, String material) {
        super(name, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
    }
}

class Grocery extends Product {
    private String expiryDate;

    public Grocery(String name, double price, String expiryDate) {
        super(name, price);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Expiry Date: " + expiryDate);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Electronics("Smartphone", 45000, 24);
        products[1] = new Clothing("Dress", 3500, "L", "Cotton");
        products[2] = new Grocery("Milk", 100, "2025-01-15");

        for (Product p : products) {
            p.displayDetails();
        }
    }
}

