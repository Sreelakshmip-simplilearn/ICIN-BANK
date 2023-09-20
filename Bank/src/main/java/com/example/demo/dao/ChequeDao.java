package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Chequebook;

public interface ChequeDao extends JpaRepository<Chequebook,Integer> {

}
