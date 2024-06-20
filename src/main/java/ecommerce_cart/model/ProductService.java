package ecommerce_cart.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
    private static final List<UpdateProduct> UPDATE_PRODUCTS = new ArrayList<>();

    // Initialize some dummy data (replace with actual database interaction)
    static {
        UPDATE_PRODUCTS.add(new UpdateProduct("1", "Samsung Galaxy", "$100", "High-Demand"));
        UPDATE_PRODUCTS.add(new UpdateProduct("2", "iPhone", "$200", "High-Demand"));
        UPDATE_PRODUCTS.add(new UpdateProduct("3", "Techno", "$300", "Low-Demand"));
    }

    // Method to get all products (for listing purposes)
    public List<UpdateProduct> getAllProducts() {
        return UPDATE_PRODUCTS;
    }

    // Method to get a specific product by ID
    public UpdateProduct getProductById(String productId) {
        for (UpdateProduct updateProduct : UPDATE_PRODUCTS) {
            if (updateProduct.getId().equals(productId)) {
                return updateProduct;
            }
        }
        return null; // Product not found
    }

    // Method to update a product
    public void updateProduct(String productId, String productName, String price, String description) throws Exception {
        // Assuming productId is already validated and exists in the database

        // Find the product by ID and update its details
        for (UpdateProduct updateProduct : UPDATE_PRODUCTS) {
            if (updateProduct.getId().equals(productId)) {
                updateProduct.setName(productName);
                updateProduct.setPrice(price);
                updateProduct.setDescription(description);
                return;
            }
        }

        throw new Exception("Product not found");
    }

    // Method to delete a product
    public void deleteProduct(String productId) throws Exception {
        Iterator<UpdateProduct> iterator = UPDATE_PRODUCTS.iterator();
        while (iterator.hasNext()) {
            UpdateProduct updateProduct = iterator.next();
            if (updateProduct.getId().equals(productId)) {
                iterator.remove(); // Remove the product from the list
                return;
            }
        }
        throw new Exception("Product not found");
    }
}

// Example Product class
class UpdateProduct {
    private String id;
    private String name;
    private String price;
    private String description;

    public UpdateProduct(String id, String name, String price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
