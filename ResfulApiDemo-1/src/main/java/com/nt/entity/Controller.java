package com.nt.entity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/global")
public class Controller {

    @GetMapping("/All")
    public ResponseEntity<String> getAll() {
        // Returning the response with the HTTP status code
        return new ResponseEntity<>("Data getting successfully", HttpStatus.OK);
    }
    
    @DeleteMapping("/delete")
    public ResponseEntity<String>delet()
    {
    	return new ResponseEntity<>("deta delete sucessfully",HttpStatus.OK);
    }
    
    @PutMapping("/put")
    public ResponseEntity<String>put(){
    	return new ResponseEntity<>("deta update sucessfully",HttpStatus.CONTINUE);
    }
     
}

