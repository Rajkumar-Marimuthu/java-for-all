package com.rojatech.java13.textblock;

public class StringBlockDemo {

	public static void main(String[] args) {
		String str = """
				<html>
				<body>
				<b>this is first html doc</b>
				</body>
				</html>
				""";
		System.out.println(str);
		
		str = """
				{
				"key":"value"
				}
				""";
		System.out.println(str);
	}

}
