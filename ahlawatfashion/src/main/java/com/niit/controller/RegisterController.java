package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.niit.model.Customer;
import com.niit.service.CustomerService;

import java.util.List;

@Controller
public class RegisterController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/register")
    public String registerCustomer(Model model){
    	Customer customer = new Customer();
        model.addAttribute("customer", customer);

        return "registerCustomer";
    }


    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerCustomerPost(@Validated @ModelAttribute("customer") Customer customer, BindingResult result, Model model){

        if(result.hasErrors()){
            return "registerCustomer";
        }

        List<Customer> customerList = customerService.getAllCustomers();

        for (int i=0; i< customerList.size(); i++){
            if(customer.getEmailId().equals(customerList.get(i).getEmailId())){
                model.addAttribute("emailMsg", "Email already exists");

                return "registerCustomer";
            }

            if(customer.getName().equals(customerList.get(i).getName())){
                model.addAttribute("usernameMsg", "Username already exists");

                return "registerCustomer";
            }
        }

        
        customerService.addCustomer(customer);
        return "login";
    }

} 