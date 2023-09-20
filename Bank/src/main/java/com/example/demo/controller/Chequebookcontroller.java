package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Chequebook;
import com.example.demo.model.Customer;
import com.example.demo.service.Chequebookservice;

@CrossOrigin (origins="http://localhost:4200")
@RequestMapping("/api/Cheque")
@RestController
public class Chequebookcontroller {
 public Chequebookcontroller(Chequebookservice chequebookservice) {
		super();
		this.chequebookservice = chequebookservice;
	}

public Chequebookservice chequebookservice;
@PostMapping
public ResponseEntity<Chequebook>SaveChequebook(@RequestBody Chequebook chequebook)
{
	return new ResponseEntity<Chequebook>(chequebookservice.savechequebook(chequebook),HttpStatus.CREATED);
}
@GetMapping
public List<Chequebook> getallChequebook()
{
	return chequebookservice.getallchequebook();
}
@PutMapping
public ResponseEntity<Chequebook>updateChequebook(@RequestBody int booknorequest)
{
	return new ResponseEntity<Chequebook>(chequebookservice.updatechequebook(booknorequest),HttpStatus.CREATED);

}
}