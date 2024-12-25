package com.nt.controoler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Student;

@RestController
@RequestMapping("student/api")
public class Student_Operation_Controller {
	@PostMapping("/ajay")

	public ResponseEntity<Student>registerStudent(@RequestBody Student stud){
	  return new ResponseEntity<Student>(stud,HttpStatus.CREATED);
	  
  }
}
