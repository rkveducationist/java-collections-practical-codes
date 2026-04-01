public class Product {
    // Private Variables (Encapsulation)
    private int id;
    private String name;
    private double price;
    private String category;

    // Constructor
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Getters (Read Only Access)
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    // Custom Print Format
    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Price: " + price + " Category: " + category;
    }
}
