package com.niit.service;
import java.util.List;

import com.niit.model.Product;
public interface ProductService  {
	List<Product> getAllProducts();
	Product getProductById(int productId);
	void deleteProduct(Product product);
	void editProduct(Product product);
	void addProduct(Product product);
}
