package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Admin;

public interface Admindao extends JpaRepository<Admin,Integer> {

}
