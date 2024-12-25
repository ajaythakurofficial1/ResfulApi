package com.nt.controller;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nt.model.ErrorDetails;
import com.nt.service.ActorNotFoundException;

@RestControllerAdvice
public class ActorControllerAdvice {

	@ExceptionHandler(ActorNotFoundException.class)
	public ResponseEntity<ErrorDetails>handleActorNotFoundException(ActorNotFoundException anfe){
		System.out.println("ActorControllerAdvice.handleActorNotFoundException()");
		ErrorDetails details=new ErrorDetails(LocalDateTime.now(),"600",anfe.getMessage());
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllProblems(Exception e) {
	    System.out.println("ActorControllerAdvice.handleAllProblems()");
	    
	    // Create an ErrorDetails object with error information
	    ErrorDetails details = new ErrorDetails(LocalDateTime.now(), "500", e.getMessage());
	    
	    // Return the response with the ErrorDetails object and an INTERNAL_SERVER_ERROR status
	    return new ResponseEntity<ErrorDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
