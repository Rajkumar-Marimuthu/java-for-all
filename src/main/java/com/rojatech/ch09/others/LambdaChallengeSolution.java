package com.rojatech.ch09.others;

public class LambdaChallengeSolution {

	public static void main(String[] args) {
		upperCaseMapper(s -> s.toUpperCase());
		Actionable1 a = ()->System.out.println("Action");
		a.run();
	}
	
	static void upperCaseMapper( StringMappable map) {
		System.out.println(map.mapString("How are you?"));
	}
}

@FunctionalInterface
interface Actionable1 {
	void run();
}

@FunctionalInterface
interface StringMappable1 {
	String mapString(String value);
}