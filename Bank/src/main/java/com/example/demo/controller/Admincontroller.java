package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin;
import com.example.demo.service.Abminservice;


@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Admin")
@RestController
public class Admincontroller {
public Admincontroller(Abminservice adminservice) {
		super();
		this.adminservice = adminservice;
	}

public Abminservice adminservice;


@PostMapping
public ResponseEntity<Admin> SaveAdmin(@RequestBody Admin admin)
{
	return new ResponseEntity<Admin>(adminservice.saveadmin(admin),HttpStatus.CREATED);
}

}
