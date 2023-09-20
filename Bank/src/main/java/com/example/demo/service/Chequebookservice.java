package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Chequebook;

@Service
public interface Chequebookservice {
	Chequebook savechequebook(Chequebook chequenbook);
	
	List<Chequebook> getallchequebook();
	Chequebook updatechequebook(int booknorequest,Chequebook chequebook);
	
}
