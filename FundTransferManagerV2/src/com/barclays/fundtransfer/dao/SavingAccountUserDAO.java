package com.barclays.fundtransfer.dao;

import java.util.HashMap;
import java.util.Map;

import com.barclays.fundtransfer.model.User;

public class SavingAccountUserDAO extends UserDAO {
	private static final Map<Long, User> usersMap;
	
	static {
		usersMap = new HashMap<Long, User>();
		usersMap.put(1L, new User(1L, "Brijesh"));
		usersMap.put(2L, new User(2L, "Rahul"));

	}
	
	@Override
	public User findByUserId(long userId) {
		return usersMap.get(userId);
	}
}