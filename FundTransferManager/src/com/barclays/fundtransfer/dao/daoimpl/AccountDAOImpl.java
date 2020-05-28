package com.barclays.fundtransfer.dao.daoimpl;

import java.util.HashMap;
import java.util.Map;

import com.barclays.fundtransfer.dao.IAccountDAO;
import com.barclays.fundtransfer.dao.IUserDAO;
import com.barclays.fundtransfer.model.BankAccount;
import com.barclays.fundtransfer.model.User;

public class AccountDAOImpl implements IAccountDAO {
	private IUserDAO userDAO;
	private Map<Long, BankAccount> accountStore;
	
	public AccountDAOImpl() {
		userDAO = new UserDAOImpl();
		accountStore = new HashMap<Long, BankAccount>();
	}
	
	@Override
	public void create() {
		User user = userDAO.getUserById(1L);
		BankAccount account = new BankAccount(1L, 2500000, user, "Saving");
		accountStore.put(1L, account);
		user = userDAO.getUserById(2L);
		account = new BankAccount(2L, 2500000, user, "Saving");
		accountStore.put(2L, account);
	}

	@Override
	public BankAccount getAccountById(long id) {
		return this.accountStore.get(id);
	}
}