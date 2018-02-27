package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.service.ProductService;

import java.util.List;

@Controller
public class HomeController {
	@Autowired
 ProductService productService;
	@RequestMapping(value= {"/","/index"})
	public String homePage()
	{
		return "index";
	}
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		return "aboutus";
	}
	@RequestMapping("/allproducts")
	public ModelAndView getAllProducts() {
		List<Product> allProducts=productService.getAllProducts();
		return new ModelAndView("allproducts","products",allProducts);
	}
	@RequestMapping("/login") 
	public String login( 
	@RequestParam(value="error", required = false) 
	            String error, 
	@RequestParam(value="logout", required = false) 
	            String logout, 
	            Model model){  
	if(error != null){ 
	model.addAttribute("error", "Invalid username and password"); 
	        }  
	if (logout !=null){ 
	model.addAttribute("msg", "You have been logged out successfully"); 
	        }  
	return "login"; 
	    } 
}
