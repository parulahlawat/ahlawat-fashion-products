package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
