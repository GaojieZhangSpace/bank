package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private String record;
	private String borrower;
	private String lender;
	private String bPlace;
	private String lPlace;
	private String bTel;
	private String lTel;
	private String bAgent;
	private String lAgent;
	private String bIsCom;
	private String lIsCom;
	
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getBorrower() {
		return borrower;
	}
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getLender() {
		return lender;
	}
	public void setLender(String lender) {
		this.lender = lender;
	}
	public String getbPlace() {
		return bPlace;
	}
	public void setbPlace(String bPlace) {
		this.bPlace = bPlace;
	}
	public String getlPlace() {
		return lPlace;
	}
	public void setlPlace(String lPlace) {
		this.lPlace = lPlace;
	}
	public String getbTel() {
		return bTel;
	}
	public void setbTel(String bTel) {
		this.bTel = bTel;
	}
	public String getlTel() {
		return lTel;
	}
	public void setlTel(String lTel) {
		this.lTel = lTel;
	}
	public String getbAgent() {
		return bAgent;
	}
	public void setbAgent(String bAgent) {
		this.bAgent = bAgent;
	}
	public String getlAgent() {
		return lAgent;
	}
	public void setlAgent(String lAgent) {
		this.lAgent = lAgent;
	}
	public String getbIsCom() {
		return bIsCom;
	}
	public void setbIsCom(String bIsCom) {
		this.bIsCom = bIsCom;
	}
	public String getlIsCom() {
		return lIsCom;
	}
	public void setlIsCom(String lIsCom) {
		this.lIsCom = lIsCom;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	}
