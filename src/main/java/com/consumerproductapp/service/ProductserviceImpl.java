package com.consumerproductapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consumerproductapp.dao.ProductDAO;
import com.consumerproductapp.model.Productentity;

@Service
public class ProductserviceImpl implements Productservice {

	@Autowired
	private ProductDAO pdao;
	
	@Transactional
	public void add(Productentity p) {

		pdao.add(p);
		
	}

	
@Transactional(readOnly = true)
public List<Productentity> listProducts() {
		// TODO Auto-generated method stub
		return pdao.listProducts();
	}

	
	
}
