/*If we have defined a variable as static and then initialized this variable in a static block then 
the Hotspot will merge the variable and the initialization in a single statement and 
hence reduce the code.*/
package com.rojatech.ch09.others;


public class StaticDemoOne {

	static int var;
	
	static {
		var = 10;
	}
	
	public static void main(String[] args) {
		System.out.println(var);

	}

}
