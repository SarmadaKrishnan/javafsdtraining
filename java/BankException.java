package com.ust.examples;

public class BankException extends Exception {
 static String message="error";
  BankException(String error)
  {
	super(error);
  }
  
  
	public static void main(String[] args) throws BankException {
		// TODO Auto-generated method stub
    if (message.equals("error"))
    {
    	System.out.println("Exception e1");
    }
    else
    {
    	throw new BankException("bank exception");
	}
	}
}
