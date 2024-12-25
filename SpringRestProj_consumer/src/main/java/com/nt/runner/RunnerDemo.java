package com.nt.runner;

import java.util.Map;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest.Headers;

@Component
public class RunnerDemo implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // Create a RestTemplate instance to perform HTTP requests
        RestTemplate template = new RestTemplate();

        // Define the URL with path variables
        String serviceUrl = "http://localhost:8080/wish/api/tourist/{name}/{id}";

        // Send a GET request using getForEntity() with path variables mapped using a Map
        ResponseEntity<String> response = template.getForEntity(
            serviceUrl,
            String.class,
            Map.of("id", 1002, "name", "ajay")  // Replace {id} and {name} with actual values
        );

        // Print the response body
        System.out.println("response body/payload: " + response.getBody());

        // Print the response status code value
        System.out.println("response status code value: " + response.getStatusCodeValue());

        // Print the response status code (e.g., 200 OK)
        System.out.println("response status code: " + response.getStatusCode());

        // Print the response headers (e.g., Content-Type, Authorization, etc.)
        System.out.println("response headers: " + response.getHeaders());
        
        
        //Headers header=new Headers();
       
       //   String response1=template.getForObject(serviceUrl,String.class, null)
    }
}

//ResponseEntity<String>response=template.getForEntity(serviceUrl,String.class);

