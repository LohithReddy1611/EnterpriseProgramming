package com.model;

import javax.ejb.Remote;

@Remote
public interface BankingRemote {
	public void withdraw(int amount);
	public void deposit(int amount);
	public int getBalance();
	

}
