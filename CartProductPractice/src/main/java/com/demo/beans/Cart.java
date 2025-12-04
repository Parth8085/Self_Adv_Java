package com.demo.beans;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="myCart")
public class Cart {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartId;
	private String cartName;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cart_product",
	joinColumns=@JoinColumn(name="cart_id"),
	inverseJoinColumns=@JoinColumn(name="product_id"))

	private Set<Product> pset=new HashSet<>();
	public Cart() {
		super();
	}
	public Cart(int cartId, String cartName, Set<Product> pset) {
		super();
		this.cartId = cartId;
		this.cartName = cartName;
		this.pset = pset;
	}
	public Cart(String name) {
		this.cartName=name;
	}
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
	public Set<Product> getpset() {
		return pset;
	}
	public void setpset(Set<Product> pset) {
		this.pset = pset;
	}
	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cartName=" + cartName + ", products=" + pset + "]";
	}
	

}
