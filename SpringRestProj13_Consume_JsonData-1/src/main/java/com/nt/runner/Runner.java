package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
         //create restTemplate object
		RestTemplate rest=new RestTemplate();
	   //prepare service url
		String serviceUrl="http://localhost:8080/wish/api/register";
		//prepare headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
	    //prepare HttpRequest as HttpEntity having headers.body
		String json_body="{\"tid\":1001,\"tname\":\"raja\",\"startPlace\":\"hyd\",\"destPlace\":\"goa\"}";
	    HttpEntity<String>request=new HttpEntity<String>(json_body,headers); 
	    //send Post mode request to consume rest api service
	    ResponseEntity<String>response=rest.postForEntity(serviceUrl, request,String.class);
	    
	    //processed recived response
	    System.out.println("response body::"+response.getBody());
	    System.out.println("response status code::"+response.getStatusCodeValue());
	    System.out.println("response code::"+response.getStatusCode());
	    System.out.println("response headers::"+response.getHeaders());
	    System.out.println("------------------");
	    
	    //send Post mode request to consume rest api service
	    String response1=rest.postForObject(serviceUrl,request,String.class);
	    System.out.println("response content/body::"+response1);
		
	
	}

}
