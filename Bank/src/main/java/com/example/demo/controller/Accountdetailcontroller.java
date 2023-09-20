package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Accountdetails;
import com.example.demo.model.Chequebook;
import com.example.demo.service.Acountdetailsservice;

@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Accountdetails")
@RestController
public class Accountdetailcontroller {


public Accountdetailcontroller(Acountdetailsservice accountdetailsservice) {
		super();
		this.accountdetailsservice = accountdetailsservice;
	}
public Acountdetailsservice accountdetailsservice;
@PostMapping
public ResponseEntity<Accountdetails>SaveAccountdetails(@RequestBody Accountdetails accountdetails)
{
	return new ResponseEntity<Accountdetails>(accountdetailsservice.saveaccountdetails(accountdetails),HttpStatus.CREATED);
}
@GetMapping
public List<Accountdetails> getallAccountdetails()
{
	return accountdetailsservice.getallaccountdetails();
}
@PutMapping
public ResponseEntity<Accountdetails>updateAccountdetails(@RequestBody int accountnumber)
{
	return new ResponseEntity<Accountdetails>(accountdetailsservice.updateaccountdetails(accountnumber),HttpStatus.CREATED);

}
}
