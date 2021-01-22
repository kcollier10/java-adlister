import models.Product;

import java.util.List;

public interface Products {

    List<Product> all(); // give all the product results
    void insert(Product product); // persist new product to the database

}
