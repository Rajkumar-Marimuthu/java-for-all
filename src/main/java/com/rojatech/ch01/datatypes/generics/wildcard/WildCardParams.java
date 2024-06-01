package com.rojatech.ch01.datatypes.generics.wildcard;

import java.util.ArrayList;

public class WildCardParams {

	public void myMethod(ArrayList<? super B> l) {
		l.add(null);
		l.add(new B());
	}
	
	public static void main(String[] args) {
		WildCardParams wcp = new WildCardParams();
		wcp.myMethod(new ArrayList<A>());
	}
}
 