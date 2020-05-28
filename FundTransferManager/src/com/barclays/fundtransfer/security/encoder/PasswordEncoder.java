package com.barclays.fundtransfer.security.encoder;

public interface PasswordEncoder {
	String encode(CharSequence var1);

	boolean matches(CharSequence var1, String var2);
}