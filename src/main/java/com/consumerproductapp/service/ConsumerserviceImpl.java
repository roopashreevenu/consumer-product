package com.consumerproductapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.consumerproductapp.dao.ConsumerDAO;
import com.consumerproductapp.model.Consumerentity;

@Service
public class ConsumerserviceImpl implements Consumerservice {

	@Autowired
	private ConsumerDAO cdao;
	
	@Transactional
	public void add(Consumerentity c) {
		// TODO Auto-generated method stub
		cdao.add(c);
	}

	@Transactional(readOnly = true)
	public List<Consumerentity> listConsumers() {
		// TODO Auto-generated method stub
		return cdao.listConsumers();
	}

	
	
}
