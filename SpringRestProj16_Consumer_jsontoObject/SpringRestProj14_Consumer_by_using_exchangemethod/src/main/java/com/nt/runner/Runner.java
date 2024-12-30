package com.nt.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
//@Component
public class Runner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
        //create template object
		RestTemplate template=new RestTemplate();
		//prepare service url
		//prepare serviceurl(or)base url+requestpath
		String serviceUrl="http://localhost:8080/wish/app/delete/{id}";
		///send delete mode request
	   template.delete(serviceUrl,Map.of("id",1001));
	   System.out.println("delete operation is completed");
       
	}
         
}
