package com.niit.dao.impl;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.dao.CustomerDao;
import com.niit.model.Authorities;
import com.niit.model.Customer;
import com.niit.model.User;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
    private SessionFactory sessionFactory;

    public void addCustomer(Customer customer){
        Session session = sessionFactory.openSession();

       
        session.saveOrUpdate(customer);
        
        User newUser = new User();
        newUser.setUsername(customer.getName());
        newUser.setPassword(customer.getPassword());
        newUser.setEnabled(true);
        newUser.setCustomerId(customer.getCustomerId());

        Authorities newAuthorities = new Authorities();
        newAuthorities.setUsername(customer.getName());
        newAuthorities.setAuthority("ROLE_USER");

        session.saveOrUpdate(newUser);
        session.saveOrUpdate(newAuthorities);



    }

    public Customer getCustomerById(int customerId){
        Session session = sessionFactory.openSession();
        return (Customer) session.get(Customer.class, customerId);
    }

    public List<Customer> getAllCustomers(){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Customer");
        List<Customer> customerList = query.list();

        return customerList;

    }

    public Customer getCustomerByUsername(String username){
        Session session = sessionFactory.openSession();
        Query query = session.createQuery("from Customer where username = ?");
        query.setString(0, username);


        return (Customer) query.uniqueResult();

}

	

	
}