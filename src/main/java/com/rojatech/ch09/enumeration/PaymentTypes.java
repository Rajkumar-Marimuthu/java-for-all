package com.rojatech.ch09.enumeration;

public enum PaymentTypes {
	DebitCard(5),
	CreditCard(0),
	Cash(10);
	
	int fee;
	
	PaymentTypes(int fee) {
		this.fee = fee;
	}
	public int getFee() {
		return this.fee;
	}
	
	
}
