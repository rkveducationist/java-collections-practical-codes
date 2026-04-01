import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // creating a list
        List<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 55000.0, "Electronics"));
        products.add(new Product(2, "Headphones", 3000.0, "Electronics"));
        products.add(new Product(3, "Desktop", 45000.0, "Electronics"));
        products.add(new Product(4, "DLink", 2000.0, "Electronics"));

        System.out.println("Before Sorting");
        System.out.println(products);
        for (Product p: products) {
            System.out.println(p);
        }

        System.out.println("\n -------------- \n");

        // sorting using Comparable (by price)
        Collections.sort(products);
        for (Product p: products) {
            System.out.println(p);
        }
    }
}