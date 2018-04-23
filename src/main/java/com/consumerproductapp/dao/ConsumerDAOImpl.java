package com.consumerproductapp.dao;

import java.util.List;

import javax.persistence.TypedQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.consumerproductapp.model.Consumerentity;

@Repository
public class ConsumerDAOImpl implements ConsumerDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	
	public void add(Consumerentity c) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(c);
	}

	public List<Consumerentity> listConsumers() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
	      TypedQuery<Consumerentity> query= (TypedQuery<Consumerentity>) sessionFactory.getCurrentSession().createQuery("from consumers");
	      return query.getResultList();
	}

}
