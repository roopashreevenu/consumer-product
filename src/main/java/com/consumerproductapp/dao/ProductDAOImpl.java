package com.consumerproductapp.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.consumerproductapp.model.Productentity;

@Repository
public class ProductDAOImpl implements ProductDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(Productentity p) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(p);
	}

	public List<Productentity> listProducts() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
	      TypedQuery<Productentity> query= (TypedQuery<Productentity>) sessionFactory.getCurrentSession().createQuery("from products");
	      return query.getResultList();
	}

}

