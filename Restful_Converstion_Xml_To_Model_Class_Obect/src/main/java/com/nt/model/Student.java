package com.nt.model;

import java.io.Serializable;

public class Student implements Serializable {
private Integer sno;
private String sname;
private double avg;
@Override
public String toString() {
	return "Student [sno=" + sno + ", sname=" + sname + ", avg=" + avg + ", vaccination=" + vaccination + "]";
}
private Boolean vaccination;
public Integer getSno() {
	return sno;
}
public void setSno(Integer sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public double getAvg() {
	return avg;
}
public void setAvg(double avg) {
	this.avg = avg;
}
public Boolean getVaccination() {
	return vaccination;
}
public void setVaccination(Boolean vaccination) {
	this.vaccination = vaccination;
}
}
