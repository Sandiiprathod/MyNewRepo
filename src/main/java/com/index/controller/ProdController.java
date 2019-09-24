package com.index.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.index.pojo.ProductEntity;
import com.index.service.ProductServiceImpl;

@Controller
public class ProdController {

	@Autowired
	ProductServiceImpl prodService;
	

      static{
		System.out.println("After Changes  ");
	}
 
	static{
		System.out.println("Inside Controller ");
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView saveProduct(@ModelAttribute(value="productEntity") ProductEntity product){
		System.out.println("Product Save Method Invoked..");
		prodService.addProduct(product);
		
		return new ModelAndView("redirect:/add");
		
	}
	
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public ModelAndView navigateToAddProductPage(){
		
		System.out.println("Product page Invoked..");
		HashMap<String,Object> model=new HashMap<>();
		model.put("productEntity", new ProductEntity());
		return new ModelAndView("addproduct", model);
		
	}
}
