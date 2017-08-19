/**
 * 
 */
package com.entity;

public class Simple1 {
	private String name;
	private String url;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void printThrowException() {
		throw new IllegalArgumentException();
	}

	public void printName(String abb) {
		System.out.println("Name is: " + this.name);
		
	}

	public void printUrl() {
		System.out.println("Url is: " + this.url);
	}
}
