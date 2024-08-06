package com.model;

import javax.ejb.Stateful;

@Stateful
public class Banking implements BankingRemote{
        int balance = 0;
	@Override
	public void withdraw(int amount) {
		balance -= amount;
	}

	@Override
	public void deposit(int amount) {
           balance += amount;
		
	}


	@Override
	public int getBalance() {
		
		return balance;
	}
	

}
