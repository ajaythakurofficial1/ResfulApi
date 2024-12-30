package com.nt.model;

import java.io.Serializable;

import java.io.Serializable;

public class Poltician implements Serializable {
 private int pid;
 private String pname;
 private String party;
 private String position;
 private float age;
@Override
public String toString() {
	return "Model [pid=" + pid + ", pname=" + pname + ", party=" + party + ", position=" + position + ", age=" + age
			+ "]";
}
public Poltician() {
	super();
}
public Poltician(int pid, String pname, String party, String position, float age) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.party = party;
	this.position = position;
	this.age = age;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getParty() {
	return party;
}
public void setParty(String party) {
	this.party = party;
}
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public float getAge() {
	return age;
}
public void setAge(float age) {
	this.age = age;
}
}
