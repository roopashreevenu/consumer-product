package com.consumerproductapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.consumerproductapp.model.Consumerentity;
import com.consumerproductapp.model.Productentity;
import com.consumerproductapp.service.Consumerservice;
import com.consumerproductapp.service.Productservice;

@Controller
@RequestMapping("/")
@ComponentScan("com.consumerproductapp") 
public class AppController {

	@Autowired
	private Consumerservice cservice;
	
	@RequestMapping(value="consumers.do",method=RequestMethod.POST)
	public ModelAndView add(Consumerentity c)
	{
		cservice.add(c);
		ModelAndView view= new ModelAndView("Product.jsp");
		return view;
	}
	
	@Autowired
	private Productservice pservice;
	
	@RequestMapping(value="products.do",method=RequestMethod.POST)
	public ModelAndView add(Productentity p)
	{
		pservice.add(p);
		ModelAndView view= new ModelAndView("Home.jsp");
		return view;
	}
	
	
   
}

