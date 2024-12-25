package com.nt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wish/api")
public class Tourist {

    @RequestMapping("/tourist/{name}/{id}")  // Mapping the URL with name and id path variables
    public ResponseEntity<String> m1(@PathVariable("name") String name, @PathVariable("id") int id) {
        // Return a response with the name and id passed in the URL
        String response = "Tourist Name: " + name + ", Tourist ID: " + id;
        return ResponseEntity.ok(response);  // Return OK status with the response
    }
}
 