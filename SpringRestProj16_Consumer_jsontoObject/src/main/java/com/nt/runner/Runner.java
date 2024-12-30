package com.nt.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.model.Poltician;
@Component
public class Runner implements CommandLineRunner {
@Autowired
private RestTemplate rest;
	@Override
	public void run(String... args) throws Exception {
     String serviceUrl="http://localhost:8080/poltician/api/find/{id}";
	 //invoke restapi/provider service
     ResponseEntity<String>response=rest.exchange(serviceUrl,HttpMethod.GET, null,String.class,1001);
     
     //analyze the response
     System.out.println("response content/body: "+response.getBody());
     System.out.println("response status code: "+response.getStatusCode());
     System.out.println("reposne status code value: "+response.getStatusCodeValue());;
     System.out.println("response headers :"+response.getHeaders());;
     
     //convert the recived json response content into java class object using jackson api(desrizlization)
     ObjectMapper mapper=new ObjectMapper();
     Poltician poltician=mapper.readValue(response.getBody(),Poltician.class);
     System.out.println("json to object convertion data::"+poltician);
     System.out.println("----------------<t>-----------------");
	 System.out.println("-----jsonobject convetion---------");
	 ObjectMapper ob=new ObjectMapper();
	}

}
