package com.rojatech.ch09.others;

public class TruncateDemo {

	// Truncate first 2 characters. E.g. ABCD => CD,  4356 => 56
	public String truncateFirstTwoCharacters(String str) {
		return "";
	}

	// Truncate A in first 2 characters. E.g. ABCD => BCD,  4356 => 4356, BCAA => BCAA, BABA => BBA
	public String truncateAInFirstTwoCharacters(String str) {
		if (str.length() <=2) {
			return str.replaceAll("A", "");
		}

		String first2Chars = str.substring(0, 2);
		String remainingChars = str.substring(2);

		return first2Chars.replaceAll("A", "")+remainingChars;
	}


	// E.g MAMA => true, 1234=> false, 1212 => true, 0000=> true, abba=> false
	public boolean areFirstTwoAndLastTwoCharactersTheSame(String str) {
		if (str.length() <2) {
			return false;
		}
		String first2Chars = str.substring(0, 2);
		String last2Chars = str.substring(str.length()-2,str.length());
		if (first2Chars.equals(last2Chars)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {


	}

}
