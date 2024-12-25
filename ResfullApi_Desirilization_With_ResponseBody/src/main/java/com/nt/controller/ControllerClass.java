package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Employee;

@RestController
@RequestMapping("/ajay")
public class ControllerClass {
	@PostMapping("/register")
  public ResponseEntity<Employee>regsiter(@RequestBody Employee e){
	  
	  
	  return new ResponseEntity<Employee>(e,HttpStatus.OK);
	  
  }
}
