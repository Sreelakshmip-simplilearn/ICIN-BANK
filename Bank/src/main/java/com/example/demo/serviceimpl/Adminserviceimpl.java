package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.dao.Admindao;
import com.example.demo.model.Admin;
import com.example.demo.model.Chequebook;
import com.example.demo.service.Abminservice;
@Service
public class Adminserviceimpl implements Abminservice{
 public Adminserviceimpl(Admindao admindao) {
		super();
		this.admindao = admindao;
	}

public Admindao admindao;
	@Override
	public Admin saveadmin(Admin admin) {
		
		return admindao.save(admin);
	}

	@Override
	public Admin loginadmin(int adminid, String password) {
		Admin admin=admindao.findById(adminid).orElseThrow();
	     return admin;
	}

}
