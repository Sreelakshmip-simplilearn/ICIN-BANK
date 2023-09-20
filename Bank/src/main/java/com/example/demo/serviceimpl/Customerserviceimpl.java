package com.example.demo.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerDao;
import com.example.demo.model.Customer;
import com.example.demo.service.Customerservice;
@Service
public class Customerserviceimpl implements Customerservice {
public Customerserviceimpl(CustomerDao customerdao) {
		super();
		this.customerdao = customerdao;
	}

public CustomerDao customerdao;
	@Override
	public Customer savecustomer(Customer customer) {
		
		return customerdao.save(customer);
	}

	@Override
	public Customer deletecustomer(int customerno) {
      Customer customer=customerdao.findById(customerno).orElseThrow();
			
	customerdao.delete(customer);
	return customer;
	
		
	}

	@Override
	public List<Customer> getallcustomers() {
		return customerdao.findAll();
	}

}
