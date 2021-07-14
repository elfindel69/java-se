package com.hb.kart.pojos;

public class Client {
	private static int sId = 0;
	private int id;
	private String firstName;
	private String lastName;
	
	public Client() {
		id = ++sId;
	}
	
	public Client(String firstName, String lastName ) {
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
}
