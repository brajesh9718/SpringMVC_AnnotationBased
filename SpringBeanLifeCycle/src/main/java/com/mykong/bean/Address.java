package com.mykong.bean;

public class Address {

	String add = "Goa";

	public Address() {
		System.out.println("Address Constructor ...");
	}

	public String getAdd() {
		System.out.println("Address " + add);
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

}
