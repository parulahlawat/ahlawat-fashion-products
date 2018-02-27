package com.niit.dao;
import java.util.List;

import com.niit.model.Product;
public interface ProductDao {
List<Product> getAllProducts();

Product getProductById(int productId);

void deleteProduct(Product product);
}
