import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productList = new ArrayList<>();

    // Add Product
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product added Successfully!");
    }

    // Display all Products
    public void displayAllProducts() {
        System.out.println("\n All Products");
        for (Product p: productList) {
            System.out.println(p);
        }
    }

    // Search Product by ID
    public void searchProductById(int id) {
        boolean found = false;

        for (Product p: productList) {
            if (p.getId() == id) {
                System.out.println("\n Product Found!");
                System.out.println(p);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\n Product not found with given ID: " + id);
        }
    }
}
