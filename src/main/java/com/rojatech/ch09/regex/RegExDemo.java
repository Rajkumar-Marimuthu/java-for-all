package com.rojatech.ch09.regex;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/*
 * 
	Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions. 
	The package includes the following classes:
	Pattern Class - Defines a pattern (to be used in a search)
	Matcher Class - Used to search for the pattern
	PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
*/
	
public class RegExDemo {

	public static boolean isEmailValid(String email) {
		String emailRegExp = "^[a-zA-Z0-9_+&*-.]+@[a-zA-Z0-9_+&*-.]+$";
		
		Pattern pat = Pattern.compile(emailRegExp);
		if (email == null) 
			return false;
		return pat.matcher(email).matches();
	}
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[abc]", "d")); // false
		System.out.println(Pattern.matches("[abc]", "abc")); // false
		System.out.println(Pattern.matches("[abc]?", "abc")); // false
		System.out.println(Pattern.matches("[abc]?", "a")); // true
		System.out.println(Pattern.matches("[abc]+", "aaabbcc")); // true
		System.out.println(Pattern.matches("[^abc]", "d")); // true
		System.out.println(Pattern.matches("[a-z&&[def]]", "d")); // true
		System.out.println(Pattern.matches("[0-9]+$", "2011")); // true
		
		System.out.println(Pattern.matches("\\d", "3")); // true
		System.out.println(Pattern.matches("\\D", "a")); // true
		System.out.println(Pattern.matches("\\D{5}", "abcde")); // true
		System.out.println(Pattern.matches("\\D{5}", "abcd")); // false
		System.out.println(Pattern.matches("\\D{2,5}", "abcd")); // true
	
		String str = "+a-+b";
		System.out.println(str.replaceAll("\\+", "\\#"));
		System.out.println(str.replace("\\+", "\\#"));
		
		// email validation
		List<String> mailAddresses = new ArrayList<String>();
		mailAddresses.add("review-team@gmail.com");
		mailAddresses.add("review.team@gmail.com");
		mailAddresses.add("test@gmail.com");
		mailAddresses.add("abcd_+&*-@com");
		
		mailAddresses.forEach(email -> {
			if (isEmailValid(email)) {
				System.out.println(email + " - valid");
			} else {
				System.out.println(email + " - not valid");
			}
		});
	}
}