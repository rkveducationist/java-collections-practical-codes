import java.util.Map;
import java.util.HashMap;

public class MapObjectsDemo {
    public static void main(String[] args) {
        Map<Integer, Product> productCatalog = new HashMap<>();

        productCatalog.put(1, new Product(1, "Laptop", 55000.0, "Electronics"));
        productCatalog.put(2, new Product(2, "Phone", 20000.0, "Electronics"));
        productCatalog.put(3, new Product(3, "Desktop", 12000.0, "Electronics"));
        productCatalog.put(4, new Product(4, "DLink", 5000.0, "Electronics"));

        System.out.println("Product Catalog");

        for (Map.Entry<Integer, Product> entry: productCatalog.entrySet()) {
            System.out.println(" Id: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}
