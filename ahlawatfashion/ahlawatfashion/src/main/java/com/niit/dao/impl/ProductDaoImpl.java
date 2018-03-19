package com.niit.dao.impl;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
//import javax.transaction.Transactional;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.niit.dao.ProductDao;
import com.niit.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
@Autowired
SessionFactory sessionFactory;

public List<Product> getAllProducts() {
	List<Product> allProducts=new ArrayList<Product>();
	Query q=sessionFactory.openSession().createQuery("from Product");
	allProducts=q.list();
	return allProducts;
}
public Product getProductById(int productId) {
	// TODO Auto-generated method stub
	try

    {  Criteria criteria=sessionFactory.openSession().createCriteria(Product.class);
      criteria.add(Restrictions.eq("productId",productId));
       Product product =(Product) criteria.uniqueResult();
                  

                   return product;

    }

    catch(Exception ex)

    {

                  System.out.println("No Product Found!!!");
                  return null;  
    }
}
public void deleteProduct(Product product) {
	// TODO Auto-generated method stub
	 Session session = sessionFactory.openSession();
     session.delete(product);
     session.flush();
	
}
public void editProduct(Product product) {
	// TODO Auto-generated method stub
	 Session session = sessionFactory.openSession();
     session.saveOrUpdate(product);
     session.flush();
}
public void addProduct(Product product) {
	// TODO Auto-generated method stub
	 Session session = sessionFactory.openSession();
     session.saveOrUpdate(product);
     session.flush();
}

}
