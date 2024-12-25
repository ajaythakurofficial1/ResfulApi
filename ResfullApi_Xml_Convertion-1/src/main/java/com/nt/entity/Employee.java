package com.nt.entity;

import java.time.LocalDateTime;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
    private int id;
    private String name;
    private String address;
    private List<String> roles;
    private Set<Long> phoneNumbers;
    private Map<String, Long> ids;
    private boolean isActive;
    private LocalDateTime dateOfJoining;
    private Company company;

    public Employee(int i, String string, String string2, List<String> of, Set<Long> of2, Map<String, Long> of3,
			boolean b, LocalDateTime of4, Company company2) {
		// TODO Auto-generated constructor stub
	}

	// Getters aur Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Same for all other fields
    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public Set<Long> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<Long> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    // And so on...
}
