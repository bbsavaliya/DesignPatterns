package com.barclays.fundtransfer.dao;

import com.barclays.fundtransfer.model.BankAccount;

public interface IAccountDAO {
	public void create();
	
	public BankAccount getAccountById(long id);
}