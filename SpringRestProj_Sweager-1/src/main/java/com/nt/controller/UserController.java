package com.nt.controller;

package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // Endpoint to get all users
    @GetMapping("/users")
    public String getUsers() {
        return "List of users";
    }

    // Endpoint to get a user by ID
    @GetMapping("/users/{id}")
    public String getUserById(@PathVariable("id") Long id) {
        return "User with ID: " + id;
    }
}
