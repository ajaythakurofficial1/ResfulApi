package com.nt.model;

import java.time.LocalDateTime;

public class ErrorDetails {
private LocalDateTime time;
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
private String status;
public LocalDateTime getTime() {
	return time;
}
public void setTime(LocalDateTime time) {
	this.time = time;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
private String message;
public ErrorDetails(LocalDateTime time, String status, String message) {
	super();
	this.time = time;
	this.status = status;
	this.message = message;
}
public ErrorDetails() {
	super();
	// TODO Auto-generated constructor stub
}

}
