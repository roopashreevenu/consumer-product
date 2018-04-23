package com.consumerproductapp.service;

import java.util.List;

import com.consumerproductapp.model.Productentity;

public interface Productservice {

	void add(Productentity p);
	List<Productentity> listProducts();
}
