package com.consumerproductapp.dao;

import java.util.List;

import com.consumerproductapp.model.Consumerentity;

public interface ConsumerDAO {

	void add(Consumerentity c);
	List<Consumerentity> listConsumers();
}
