//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create Product Manage Object
        ProductManager pManager = new ProductManager();

        // Add Products
        pManager.addProduct(new Product(1, "Laptop", 55000, "Electronics"));
        pManager.addProduct(new Product(2, "Mobile", 20000, "Electronics"));
        pManager.addProduct(new Product(3, "Table", 12000, "Furniture"));
        pManager.addProduct(new Product(4, "Chair", 8000, "Furniture"));
        pManager.addProduct(new Product(5, "Headphones", 3000, "Electronics"));

        // Display All Products
        pManager.displayAllProducts();

        // Search Product by ID
        pManager.searchProductById(3);
    }
}