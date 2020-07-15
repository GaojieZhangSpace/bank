package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Info {
  private String id;
  private String cn;
  private String date;
  private String zi;
  private String debt;
  private String currency;
  private String startDay;
  private String endDay;
  private Person person1;
  private Person person2;
  
public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getCn() {
	return cn;
}



public void setCn(String cn) {
	this.cn = cn;
}



public String getDate() {
	return date;
}



public void setDate(String date) {
	this.date = date;
}



public String getZi() {
	return zi;
}



public void setZi(String zi) {
	this.zi = zi;
}



public String getDebt() {
	return debt;
}



public void setDebt(String debt) {
	this.debt = debt;
}



public String getCurrency() {
	return currency;
}



public void setCurrency(String currency) {
	this.currency = currency;
}



public String getStartDay() {
	return startDay;
}



public void setStartDay(String startDay) {
	this.startDay = startDay;
}



public String getEndDay() {
	return endDay;
}



public void setEndDay(String endDay) {
	this.endDay = endDay;
}

public Person getPerson1() {
	return person1;
}



public void setPerson1(Person person1) {
	this.person1 = person1;
}



public Person getPerson2() {
	return person2;
}



public void setPerson2(Person person2) {
	this.person2 = person2;
}



@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
