package com.demo.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="myuser")
public class MyUser {
	
	
	@Id
	private int id;
	private String name;
	private String email;
	public MyUser() {
	
	}
	public MyUser(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	

}
