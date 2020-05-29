package com.barclays.fundtransfer.dao;

import com.barclays.fundtransfer.model.User;

public abstract class UserDAO {
	private static final UserDAO userDAO = new SavingAccountUserDAO();
	
	public abstract User findByUserId(long userId);
	
	public static UserDAO getInstance() {
		return userDAO;
	}
}