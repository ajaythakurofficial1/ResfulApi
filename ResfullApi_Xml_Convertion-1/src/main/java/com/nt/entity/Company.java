package com.nt.entity;

import java.io.Serializable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RestController
//@RequestMapping("/ajay")//globa path for every request
public class Company implements Serializable {
   private String name;
   private String location;
   private Integer size;
   private Double turnover;
   private String category;
@Override
public String toString() {
	return "Company [name=" + name + ", location=" + location + ", size=" + size + ", turnover=" + turnover
			+ ", category=" + category + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Integer getSize() {
	return size;
}
public void setSize(Integer size) {
	this.size = size;
}
public Double getTurnover() {
	return turnover;
}
public void setTurnover(Double turnover) {
	this.turnover = turnover;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Company(String name, String location, Integer size, Double turnover, String category) {
	super();
	this.name = name;
	this.location = location;
	this.size = size;
	this.turnover = turnover;
	this.category = category;
}
}
