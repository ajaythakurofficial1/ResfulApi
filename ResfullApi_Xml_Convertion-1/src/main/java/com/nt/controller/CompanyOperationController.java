package com.nt.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.Company;
import com.nt.entity.Employee;

@RestController
@RequestMapping("/ajay") // Global path
public class CompanyOperationController {

    @GetMapping("/all")
    public ResponseEntity<Company> showCompanyDetails() {
        // Create the company object
        Company company = new Company("HCL", "Hyderabad", 100, 500000000.0, "IT");
        
        
        
        // Return the employee object wrapped in ResponseEntity
        return new ResponseEntity<Company>(company, HttpStatus.OK); // Return employee details with HTTP status 200 OK
    }
}
