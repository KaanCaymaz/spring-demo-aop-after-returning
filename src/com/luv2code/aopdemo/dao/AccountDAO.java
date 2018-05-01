package com.luv2code.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.luv2code.aopdemo.Account;

@Repository
public class AccountDAO {
	private String name;
	
	public List<Account> findAccounts(boolean wire) throws Exception{
		List<Account> accounts = new ArrayList<>();
		
		if(wire) {
			throw new Exception("Exception throwed by findAccounts()!!!!!");
		}
		
		Account a1 = new Account("Kaan","Premium");
		Account a2 = new Account("Hakan", "Gold");
		
		accounts.add(a1);
		accounts.add(a2);
		
		return accounts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
