package com.demo.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="MyProduct")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private double price;
	
	@ManyToMany(mappedBy="pset")
	private Set<Cart> cset=new HashSet<>();  //means that the product can be in many carts
	public Product() {
		super();
	}
	public Product(String pname,double price)
	{
		this.pname=pname;
		this.price=price;
		
	}
	public Product(int pid, String pname, double price, Set<Cart> carts) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.cset = carts;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Set<Cart> getcset() {
		return cset;
	}
	public void setcset(Set<Cart> carts) {
		this.cset = carts;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
	

}
