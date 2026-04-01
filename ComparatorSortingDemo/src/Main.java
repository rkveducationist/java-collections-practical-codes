import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 55000.0, "Electronics"));
        products.add(new Product(2, "Phone", 20000.0, "Electronics"));
        products.add(new Product(3, "Headphones", 3000.0, "Electronics"));
        products.add(new Product(4, "Desk", 12000.0, "Furniture"));

        System.out.println("Original List");
        for (Product p: products) {
            System.out.println(p);
        }

        // Sort By Name
        Collections.sort(products, new SortByName());
        System.out.println("Sort By Name List");
        for (Product p: products) {
            System.out.println(p);
        }

        // Sort By Category
        Collections.sort(products, new SortByCategory());
        System.out.println("Sort By Category List");
        for (Product p: products) {
            System.out.println(p);
        }
    }
}