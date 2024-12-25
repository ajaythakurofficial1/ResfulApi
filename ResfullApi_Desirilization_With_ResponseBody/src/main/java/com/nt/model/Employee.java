package com.nt.model;

import java.io.Serializable;

public class Employee implements Serializable {
private Integer id;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddrs() {
	return addrs;
}
public void setAddrs(String addrs) {
	this.addrs = addrs;
}
private String name;
private String addrs;
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", addrs=" + addrs + "]";
}

}
