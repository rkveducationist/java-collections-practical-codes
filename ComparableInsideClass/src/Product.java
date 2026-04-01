// model class with natural ordering using comparable
public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;
    private String category;

    // constructor
    public Product(int id, String name, double price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // getters
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

    // natural ordering: sort by price (ascending)
    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }

    // display
    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Price (rs): " + price + " Category: " + category;
    }
}
