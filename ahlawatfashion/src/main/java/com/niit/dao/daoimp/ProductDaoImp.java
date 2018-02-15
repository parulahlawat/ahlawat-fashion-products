package com.niit.dao.daoimp;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
//import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Repository
@Transactional
public class ProductDaoImp implements ProductDao {
@Autowired
SessionFactory sessionFactory;
public List<Product> getAllProducts() {
	List<Product> allProducts=new ArrayList<Product>();
	Query q=sessionFactory.openSession().createQuery("from Product");
	allProducts=q.list();
	return allProducts;
}

}
