package com.nt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/api")
public class StudentOperationController {

	@GetMapping("/report/{sno}/{sname}")
	public ResponseEntity<String>showReport1(@PathVariable(name="sno",required=false)Integer no,
			                              @PathVariable(required=false)String sname){
		return new ResponseEntity<String>("from showReport1",HttpStatus.OK);
	}
	@GetMapping("report/sno/{sname}")
	public ResponseEntity<String>showReport2(@PathVariable(name="sno",required=false)Integer no,
			                                 @PathVariable(required=false)String sname){
		return new ResponseEntity<String>("from showRepost2",HttpStatus.OK); 
	}
	
	@GetMapping("/report/{sno}/sname")
	public ResponseEntity<String>showReport3(@PathVariable(name="sno",required=false)int no,
			                                  @PathVariable(required=false)String sname){
		return new ResponseEntity<String>("from showReport3",HttpStatus.OK);
	}
	@GetMapping("/report/101/sname")
	public ResponseEntity<String>showReport4(@PathVariable(name="sno",required=false)Integer no,
			                                  @PathVariable(required=false) String name){
		return new ResponseEntity<String>("from showReport4",HttpStatus.OK);
	}
	@GetMapping("/report/101/sname")
	public ResponseEntity<String>showReport5(@PathVariable(name="sno",required=false)Integer no,
			                                  @PathVariable(required=false) String name){
		return new ResponseEntity<String>("from showReport5",HttpStatus.OK);
	}
}
