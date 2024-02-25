package com.rojatech.ch01.oops;
import lombok.Data;
import lombok.Setter;

import java.util.Arrays;
import java.util.Date;

enum OrgType {
	COLLEGE,
	HOSPITAL,
	SHOP
}

@Data
class Organization {
	private String orgName;
	private OrgType orgType;
	private String[] owners;
	private String location;
	private Date yearOfEstablish;

	// To define any constant
	private static final String CHANCELLOR = "Governor";
}

class College extends Organization {

	public College() {
		super();
	}
	
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Organization srm = new College();
		srm.setLocation("Chennai");
		System.out.println(srm.toString());
		

	}

}
