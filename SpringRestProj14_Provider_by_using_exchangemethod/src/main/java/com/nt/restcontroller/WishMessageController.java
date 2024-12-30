package com.nt.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish/app")
public class WishMessageController {
    @GetMapping("report")
	public ResponseEntity<String>showwishmessage(){
    	System.out.println("WishMessageController.showwishmessage()");
		return new ResponseEntity<String>("good night",HttpStatus.OK);
	}
	
    @GetMapping("/message/{id}/{name}")
    public ResponseEntity<String>message(@PathVariable ("id")int id,@PathVariable("name")String msg){
    	 System.out.println("WishMessageController.message()");
    	return new ResponseEntity<String>(id+"="+msg,HttpStatus.OK);
    }
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteTourist(@PathVariable("id")int id){
		System.out.println("WishMessageController.deleteTourist()"+id);
		return new ResponseEntity<String>(id+"Tourist is deleted",HttpStatus.OK);
	}
	
	
	
	
	
}
