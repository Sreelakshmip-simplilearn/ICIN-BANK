package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;

@Service
public interface Customerservice {

	Customer savecustomer(Customer customer);
	Customer deletecustomer(int customerno);
	List<Customer> getallcustomers();
	
}
