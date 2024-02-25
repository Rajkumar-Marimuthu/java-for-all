package com.rojatech.ch09.others;

public class UserDefinedExceptionDemo {

	public static void main(String[] args) {
		int i=5;
		try {
			if (i==5) {
				throw new MyException("multiple of 5");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}

class MyException extends Exception {
	
	public MyException(String msg) {
		super(msg);
	}
}
