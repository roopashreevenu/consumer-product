package com.consumerproductapp.service;

import java.util.List;

import com.consumerproductapp.model.Consumerentity;

public interface Consumerservice {

	void add(Consumerentity c);
	List<Consumerentity> listConsumers();
	
}