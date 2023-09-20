package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Accountdetails {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int accountnumber;
	String name;
	int openingbalance;
	int transferamount;
	int closingbalance;
	String ifsccode;
	String paymentmethod;
	String branch;
	String Recepientsname;
	int Receipientbankaccnumber;
	String Status;
	String accounttransactionaccess;
	
}
