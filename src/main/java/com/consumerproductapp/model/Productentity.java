package com.consumerproductapp.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class Productentity implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID")
	private int pid;
	
	@Column(name = "PRODUCT_NAME")
	private String pname;
	
	@Column(name = "PRODUCT_PRICE")
	private String pprice;
	
	@Column(name = "PRODUCT_TYPE")
	private String ptype;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPprice() {
		return pprice;
	}

	public void setPprice(String pprice) {
		this.pprice = pprice;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	@Override
	public String toString() {
		return "Productentity [pid=" + pid + ", pname=" + pname + ", pprice=" + pprice + ", ptype=" + ptype + "]";
	}
	
	
}

