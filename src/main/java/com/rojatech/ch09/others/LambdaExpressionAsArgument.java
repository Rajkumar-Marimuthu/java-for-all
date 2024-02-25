package com.rojatech.ch09.others;

public class LambdaExpressionAsArgument {

	public static void main(String[] args) {
		System.out.println(runTest(str->str.length()>5, "hello"));
		System.out.println(runTest(str->str.startsWith("A"), "Arvind"));

	}
	
	public static boolean runTest(Tester t, String str) {
		return t.test(str);
	}

}

interface Tester {
	boolean test(String str);
}
