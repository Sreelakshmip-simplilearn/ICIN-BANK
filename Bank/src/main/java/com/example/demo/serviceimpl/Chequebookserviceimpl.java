package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.ChequeDao;
import com.example.demo.model.Chequebook;
import com.example.demo.service.Chequebookservice;
@Service
public class Chequebookserviceimpl implements Chequebookservice {
public Chequebookserviceimpl(ChequeDao chequedao) {
		super();
		this.chequedao = chequedao;
	}

public ChequeDao chequedao;
	@Override
	public Chequebook savechequebook(Chequebook chequenbook) {
		return chequedao.save(chequenbook);
	}

	@Override
	public List<Chequebook> getallchequebook() {
		return chequedao.findAll();
		
	}

	@Override
	public Chequebook updatechequebook(int booknorequest,Chequebook chequebook) {
		 chequebook=chequedao.findById(booknorequest).orElseThrow();
		Chequebook updatechequebook=chequedao.save(chequebook);
		
		return updatechequebook;
	}

	
}
