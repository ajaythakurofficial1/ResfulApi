package com.nt.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
@Entity
@Table(name="REST_ACTOR")
public class Actor implements Serializable {
@Id
//@GeneratedValue
private Integer actorid;
@Override
public String toString() {
	return "Actor [version=" + version + "]";
}

private String actorname;
private String category;
@Column(length=10)
private Long mobileNo;

@Version
private Integer version;
public Integer getVersion() {
	return version;
}
public void setVersion(Integer version) {
	this.version = version;
}
public Integer getActorid() {
	return actorid;
}
public void setActorid(Integer actorid) {
	this.actorid = actorid;
}
public String getActorname() {
	return actorname;
}
public void setActorname(String actorname) {
	this.actorname = actorname;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}
}
