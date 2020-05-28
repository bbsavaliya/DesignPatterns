package com.barclays.fundtransfer.dao.daoimpl;

import java.util.HashMap;
import java.util.Map;

import com.barclays.fundtransfer.dao.IUserDAO;
import com.barclays.fundtransfer.model.User;
import com.barclays.fundtransfer.security.encoder.PasswordEncoder;
import com.barclays.fundtransfer.security.encoderimpl.BCryptPasswordEncoder;

public class UserDAOImpl implements IUserDAO {
	private static final Map<Long, User> userStore = new HashMap<Long, User>();
	private final PasswordEncoder passwordEncoder;
	
	public UserDAOImpl() {
		this.passwordEncoder = new BCryptPasswordEncoder();
	}

	@Override
	public void create() {
		User user = new User(1, "Brijesh", this.passwordEncoder.encode("Brijesh"));
		userStore.put(1L, user);
		user = new User(2, "Rahul", this.passwordEncoder.encode("Rahul"));
		userStore.put(2L, user);
	}

	@Override
	public User getUserById(long id) {
		return userStore.get(id);
	}
}