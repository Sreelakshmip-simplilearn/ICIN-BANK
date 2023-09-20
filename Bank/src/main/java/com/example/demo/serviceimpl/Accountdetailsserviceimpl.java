package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.Accountdetaildao;
import com.example.demo.model.Accountdetails;
import com.example.demo.service.Acountdetailsservice;

@Service
public class Accountdetailsserviceimpl implements Acountdetailsservice {
  public Accountdetailsserviceimpl(Accountdetaildao accountdetaildao) {
		super();
		this.accountdetaildao = accountdetaildao;
	}

public Accountdetaildao accountdetaildao;
	@Override
	public Accountdetails saveaccountdetails(Accountdetails accountdetails) {
		// TODO Auto-generated method stub
		return accountdetaildao.save(accountdetails);
	}

	@Override
	public Accountdetails updateaccountdetails(int accountnumber) {
		Accountdetails accountdetails=accountdetaildao.findById(accountnumber).orElseThrow();
		Accountdetails updatedaccountdetails=accountdetaildao.save(accountdetails);
		return updatedaccountdetails;
	}

	@Override
	public List<Accountdetails> getallaccountdetails() {
		// TODO Auto-generated method stub
return accountdetaildao.findAll();
	}

}
