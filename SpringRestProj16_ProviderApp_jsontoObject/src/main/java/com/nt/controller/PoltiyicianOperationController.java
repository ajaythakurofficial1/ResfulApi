package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Poltician;

@RestController
@RequestMapping("/poltician/api")
public class PoltiyicianOperationController {

	@GetMapping("/find/{id}")
	public ResponseEntity<Poltician>findPolticianById(@PathVariable("id")int id){
		return new ResponseEntity<Poltician>(new Poltician(id,"modi","bjp","PM",65.0F),HttpStatus.OK);
		
	}
	@GetMapping("/report")
	public ResponseEntity<List<Poltician>>showAllPoltician(){
		List<Poltician>list=List.of(new Poltician(1001,"modi","bjp","pm",67.8f),
				                    new Poltician(1002,"amitsha","bjp","hm",67.8f),
				                    new Poltician(1003,"yogi","bjp","cm",61.8f));
	  return new ResponseEntity<List<Poltician>>(list,HttpStatus.OK);
	}
	
	@GetMapping("/report1")
	public ResponseEntity<Map<String,Object>>showIdCards(){
		Map<String,Object>map=Map.of("aadhar",54545454,"voterid",77777777,"passport",353353454);
	   return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
	}
}
