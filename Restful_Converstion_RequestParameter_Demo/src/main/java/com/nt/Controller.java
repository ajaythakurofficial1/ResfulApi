package com.nt;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer/api")
public class Controller {

    @GetMapping("/report")
    public ResponseEntity<String> showReport(@RequestParam ("no1")int no1, @RequestParam(required=false) String cname1) {
        // Print the values to the console
        System.out.println(no1 + " " + cname1);

        // Return the response with concatenated values
        return new ResponseEntity<String>(no1 + " " + cname1, HttpStatus.OK);
    }
}
