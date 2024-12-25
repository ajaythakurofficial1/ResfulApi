package com.nt.model;

import java.io.Serializable;

public class Tourist implements Serializable {
private int tid;
private String tname;
private String startPlace;
private String destPlace;
@Override
public String toString() {
	return "Tourist [tid=" + tid + ", tname=" + tname + ", startPlace=" + startPlace + ", destPlace=" + destPlace + "]";
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getTname() {
	return tname;
}
public void setTname(String tname) {
	this.tname = tname;
}
public String getStartPlace() {
	return startPlace;
}
public void setStartPlace(String startPlace) {
	this.startPlace = startPlace;
}
public String getDestPlace() {
	return destPlace;
}
public void setDestPlace(String destPlace) {
	this.destPlace = destPlace;
}
}
