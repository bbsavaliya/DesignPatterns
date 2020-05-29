package com.barclays.fundtransfer.processor;

import com.barclays.fundtransfer.dao.UserDAO;
import com.barclays.fundtransfer.model.User;
import com.barclays.fundtransfer.request.Request;
import com.barclays.fundtransfer.request.Response;

public class AuthenticationProcessor implements Processor {
	private final Processor nextProcessor;
	
	public AuthenticationProcessor(Processor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}
	
	@Override
	public Response process(Request request) {
        User user= UserDAO.getInstance().findByUserId(request.getUserId());
        if(request.getPassword().equals(user.getPassword())){
            System.out.println("User successfully authenticated");
            if(null !=nextProcessor) {
                return nextProcessor.process(request);
            }else{
                return new Response(request.getSourceAccountId(),request.getDestinationAccountId(),true);
            }
        }else{
        	System.out.println("User Authentication failed");
            return new Response(request.getSourceAccountId(),request.getDestinationAccountId(),false);

        }
    }
}