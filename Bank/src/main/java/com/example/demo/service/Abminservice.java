package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Admin;

@Service
public interface Abminservice {
	Admin saveadmin(Admin admin);
	Admin loginadmin (int adminid,String password);

}
