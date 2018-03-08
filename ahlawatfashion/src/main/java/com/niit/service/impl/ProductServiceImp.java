package com.niit.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.niit.model.Product;
import com.niit.dao.ProductDao;
import com.niit.service.ProductService;
@Service
public class ProductServiceImp implements ProductService {
@Autowired
	ProductDao productDao;
	public List<Product> getAllProducts() {
		return productDao.getAllProducts(); 
	}
	public Product getProductById(int productId) {
		// TODO Auto-generated method stub
		return productDao.getProductById(productId) ;
	}
	public void deleteProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(product);
		
	}
	public void editProduct(Product product) {
		  productDao.editProduct(product);	
		}
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		 productDao.addProduct(product);
	}
}

