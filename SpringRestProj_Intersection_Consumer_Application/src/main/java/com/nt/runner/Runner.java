package com.nt.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
        //create Resttemplate object
		RestTemplate template=new RestTemplate();
        //prepare service url(or) base url+requestpath
		String serviceUrl="http://localhost:8080/wish/api/message";
	    //consume the service using xxxForEntity(-)method
		ResponseEntity<String>response=template.getForEntity(serviceUrl,String.class);
		  //process response
		System.out.println("response body/payload)::"+response.getBody());
		System.out.println("response status code value::"+response.getStatusCodeValue());
		System.out.println("response codecode:::"+response.getStatusCode());
		System.out.println("response headers::"+response.getHeaders());
	}

}
