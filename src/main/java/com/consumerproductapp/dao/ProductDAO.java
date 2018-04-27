package com.consumerproductapp.dao;

import java.util.List;

import com.consumerproductapp.model.Productentity;

public interface ProductDAO {

	void add(Productentity p);
	List<Productentity> listProducts() ;
	List<Productentity> listProduct() ;
}
