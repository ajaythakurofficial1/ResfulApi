package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Poltician;
@Component
public class Runner1 implements CommandLineRunner {
@Autowired
private RestTemplate rest;
	@Override
	public void run(String... args) throws Exception {
   //  String serviceUrl="http://localhost:8080/poltician/api/report";
     String serviceUrl="http://localhost:8080/poltician/api/report";

     ResponseEntity<String>response=rest.exchange(serviceUrl,HttpMethod.GET, null,String.class);
     System.out.println("----------------<list>--------------");
     System.out.println("response body: "+response.getBody());
     System.out.println("response status code:"+response.getStatusCode());
	 System.out.println("response status value: "+response.getStatusCodeValue());
	 System.out.println("response headers : "+response.getHeaders());
      ObjectMapper mapper=new ObjectMapper();
	 Poltician poltician1[]=mapper.readValue(response.getBody(),Poltician[].class);
	 List<Poltician>list=Arrays.asList(poltician1);

	 System.out.println(list);
	 
	 System.out.println("..............");
	 List<Poltician>list1=mapper.readValue(response.getBody(),new TypeReference<List<Poltician>>() {});
	
	}

}
