package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Accountdetails;
import com.example.demo.model.Chequebook;

@Service
public interface Acountdetailsservice {
	Accountdetails saveaccountdetails(Accountdetails accountdetails);
	Accountdetails updateaccountdetails(int accountnumber);
	List<Accountdetails> getallaccountdetails();

	

}
