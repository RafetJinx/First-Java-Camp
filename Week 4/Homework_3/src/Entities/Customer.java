package Entities;

import Abstract.Entity;

public class Customer implements Entity{
	private int id;
	private String email;
	private String contactNumber;
	
	public Customer(int id, String email, String contactNumber) {
		super();
		this.id = id;
		this.email = email;
		this.contactNumber = contactNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}
