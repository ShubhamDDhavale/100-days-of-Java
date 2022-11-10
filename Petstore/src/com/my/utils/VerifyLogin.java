package com.my.utils;

public class VerifyLogin{
	private static boolean flagA= false;
	private static boolean flagC= false;
	public static boolean verifyAdmin() {
		return flagA;
		
	}
	public static boolean verifyCustomer() {
		return flagC;
		
	}
	public static boolean verifyAdmin(String loginId , String password) {
		 
		if(loginId.equals("admin") && password.equals("password") ) {
			flagA = true;
			return true;
		}
		return false;
	}

	public static boolean verifyCustomer(String loginId, String password) {
		if(loginId.equals("c1") && password.equals("c1") ) {
			flagC = true;
			return true;
		}
		return false;
	}
}

