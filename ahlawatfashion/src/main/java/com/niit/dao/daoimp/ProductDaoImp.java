package com.niit.dao.daoimp;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Repository
@Transactional
public class ProductDaoImp implements ProductDao {
@Autowired
Product product;

public List<Product> getAllProduct() {
	// TODO Auto-generated method stub
	return null;
}

}
