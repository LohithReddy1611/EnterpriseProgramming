package com.controller;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;

import com.model.BankingRemote;

@ManagedBean(name="bank" ,eager=true)

public class BankData {
	int wdam;
	int deam;
	int bal;
	@EJB(lookup="java:global/EPS03-EJB-Stateful/Banking!com.model.BankingRemote")
	BankingRemote BR;
	
	public int getWdam() {
		return wdam;
	}
	public void setWdam(int wdam) {
		this.wdam = wdam;
	}
	public int getDeam() {
		return deam;
	}
	public void setDeam(int deam) {
		this.deam = deam;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	public void callEjbwithdraw() {
		
		BR.withdraw(wdam);
		bal=BR.getBalance();
		
		
	}
	public void callEjbdeposit()
	{
		BR.deposit(deam);
		bal=BR.getBalance();
		}

}