package com.nt.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class GetModeConsumer implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		//create resttemplate class object
		RestTemplate template=new RestTemplate();
		
		//prepare service url
		String serviceUrl="http://localhost:8080/wish/app/report";
		
		//invoke the exchange method
		ResponseEntity<String>response1=template.exchange(serviceUrl,HttpMethod.GET,null,String.class);
	
	  System.out.println("response body contenet: "+response1.getBody());
	  System.out.println("respose headers: "+response1.getHeaders());;
	  System.out.println("response status code::"+response1.getStatusCode()+"status code value"+response1.getStatusCodeValue());; 
	
	System.out.println("----------------------------");
	//prepare service url
	  serviceUrl="http://localhost:8080/wish/app/message/{id}/{name}";
		//incoke the exchange method
	  ResponseEntity<String>response2=template.exchange(serviceUrl,HttpMethod.GET,null,String.class,Map.of("id",101,"name","ajay"));
		
	  System.out.println("response body content: "+response2.getBody() );
	  System.out.println("response headers: "+response2.getHeaders());
      System.out.println("respnse status code: "+response2.getStatusCode()+"staus code value"+response2.getStatusCodeValue());
      System.out.println("=====================");
	  
	
	}

}
