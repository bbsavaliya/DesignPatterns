package com.barclays.fundtransfer.service.authservice.authserviceimpl;

import com.barclays.fundtransfer.dao.IUserDAO;
import com.barclays.fundtransfer.dao.daoimpl.UserDAOImpl;
import com.barclays.fundtransfer.handler.IHandler;
import com.barclays.fundtransfer.request.IServiceRequest;
import com.barclays.fundtransfer.security.encoder.PasswordEncoder;
import com.barclays.fundtransfer.security.encoderimpl.BCryptPasswordEncoder;
import com.barclays.fundtransfer.service.authservice.IAuthServiceHandler;

public class AuthServiceHandlerImpl implements IAuthServiceHandler {
	private final PasswordEncoder encoder;
	private final IUserDAO userDAO;
	private IHandler handler;
	
	public AuthServiceHandlerImpl() {
		this.encoder = new BCryptPasswordEncoder();
		this.userDAO = new UserDAOImpl();
	}

	@Override
	public boolean isAuthenticated(IServiceRequest request) {
		boolean isValid = this.encoder.matches(request.getPassword(), this.userDAO.getUserById(request.getUserId()).getPassword());
		return isValid;
	}

	@Override
	public boolean handle(IServiceRequest serviceRequest) {
		if(this.isAuthenticated(serviceRequest)) {
			System.out.println("Username/Password Auth Successfull");
			return handler == null ? true : handler.handle(serviceRequest);
		} else {
			System.out.println("Username/Password Auth failed");
			return false;
		}
	}

	@Override
	public void setNextRequestHandler(IHandler requestHandler) {
		this.handler = requestHandler;
	}
}