package com.rojatech.ch09.others;

public class LambdaChallenge {

	public static void main(String[] args) {
		upperCaseMapper(new StringMapUtil());
		
	}
	
	static void upperCaseMapper( StringMappable map) {
		System.out.println(map.mapString("How are you?"));
	}

}

class ActionImpl implements Actionable {
	@Override
	public void run() {
		System.out.println("Action");
	}
}

class StringMapUtil implements StringMappable {

	@Override
	public String mapString(String value) {
		return value.toUpperCase();
	}
	
}
@FunctionalInterface
interface Actionable {
	void run();
}

@FunctionalInterface
interface StringMappable {
	String mapString(String value);
}