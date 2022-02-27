package com.priya.database.databasedemo.entity;

import java.sql.Timestamp;

public class Person {
	
	private int id;
	private String name;
	private String location;
	private Timestamp birthDate;
	
	
	public Person() {
		
		
	}
	public Person(int id, String name, String location, Timestamp birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birthDate = birthDate;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public Timestamp getBirthDate() {
		return birthDate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setBirthDate(Timestamp timestamp) {
		this.birthDate = timestamp;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", birthDate=" + birthDate + "]";
	}
	

}
