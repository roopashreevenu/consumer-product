package com.consumerproductapp.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "CONSUMERS")
public class Consumerentity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CONSUMER_ID")
    private int cid;
	
	@Column(name = "CONSUMER_NAME")
	private String Cname;
	
	@Column(name = "CONSUMER_ADDRESS")
	private String Caddress;
	
	@Column(name = "CONSUMER_CONTACT")
	private String Ccontact;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public String getCaddress() {
		return Caddress;
	}

	public void setCaddress(String caddress) {
		Caddress = caddress;
	}

	public String getCcontact() {
		return Ccontact;
	}

	public void setCcontact(String ccontact) {
		Ccontact = ccontact;
	}

	@Override
	public String toString() {
		return "Consumerentity [cid=" + cid + ", Cname=" + Cname + ", Caddress=" + Caddress + ", Ccontact=" + Ccontact
				+ "]";
	}
	//gitpush_test
}
