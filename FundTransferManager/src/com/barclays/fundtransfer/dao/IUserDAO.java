package com.barclays.fundtransfer.dao;

import com.barclays.fundtransfer.model.User;

public interface IUserDAO {
	public void create();
	
	public User getUserById(long id);
}