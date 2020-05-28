package com.barclays.fundtransfer;

import java.util.ArrayList;
import java.util.List;

import com.barclays.fundtransfer.dao.IAccountDAO;
import com.barclays.fundtransfer.dao.IUserDAO;
import com.barclays.fundtransfer.dao.daoimpl.AccountDAOImpl;
import com.barclays.fundtransfer.dao.daoimpl.UserDAOImpl;
import com.barclays.fundtransfer.handler.IHandler;
import com.barclays.fundtransfer.request.IServiceRequest;
import com.barclays.fundtransfer.request.requestimpl.ServiceRequestImpl;
import com.barclays.fundtransfer.service.auditservice.audiserviceimpl.AuditHandlerImpl;
import com.barclays.fundtransfer.service.authservice.authserviceimpl.AuthServiceHandlerImpl;

public class FundTransferMain {
	public static void main(String[] args) {
		IUserDAO userDAO = new UserDAOImpl();
		IAccountDAO accountDAO = new AccountDAOImpl();
		
		userDAO.create();
		accountDAO.create();
		
		IServiceRequest serviceRequest = new ServiceRequestImpl(1, "Brijesh", 1, 2, 500);
        List<IHandler> requestHandlers = new ArrayList<IHandler>();
        requestHandlers.add(new AuthServiceHandlerImpl());
        requestHandlers.add(new AuditHandlerImpl());

        // create the chain of Handler
        for (int i = 0; i < requestHandlers.size() - 1; i++) {
            requestHandlers.get(i).setNextRequestHandler(requestHandlers.get(i + 1));
        }
        requestHandlers.get(0).handle(serviceRequest);
	}
}