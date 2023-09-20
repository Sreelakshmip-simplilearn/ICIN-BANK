package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.Customerservice;

@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Customer")
@RestController
public class Customercontroller {
	public Customercontroller(Customerservice customerservice) {
		super();
		this.customerservice = customerservice;
	}

	public Customerservice customerservice;
	@PostMapping
	public ResponseEntity<Customer>SaveCustomer(@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerservice.savecustomer(customer),HttpStatus.CREATED);
	}
    @DeleteMapping
	public ResponseEntity<Customer>deletecustomer(@RequestBody int customerno)
	{
		customerservice.deletecustomer(customerno);
		return null;
	}
}
