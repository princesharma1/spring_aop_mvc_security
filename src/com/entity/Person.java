/**
 * 
 */
package com.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "person")    
public class Person implements Serializable{
	private String name;
	private int id;
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	@XmlElement
	public void setId(int id) {
		this.id = id;
	}   
	public Person(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void display()
	{
		System.out.println(" Name: " + name);
	}
	

}
