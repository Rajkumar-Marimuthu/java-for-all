package com.rojatech.javachallenges.others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Luhn's algorithm determines whether or not a credit card number is valid. For a given credit card number:

Double the value of every other digit from right to left, beginning with the second to last digit.
Add the digits of the results of Step 1 to the remaining digits in the credit card number.
If the result mod 10 is equal to 0, the number is valid. If the result mod 10 is not equal to 0, the validation fails.
Example

A credit card of type Visa is added with the number 4624 7482 3324 9080. This number is invalid.
A Visa credit card of number 4624 7482 3324 9780, on the other hand, passes the validation.
 */

public class CreditCardNumberValidation {

	public static void main(String[] args) {
		System.out.println("Credit Card Number Validation:");

		String cardNumber = " 4624748233249780 ";
		
		cardNumber = cardNumber.replaceAll("\\s","");
		
		Pattern p = Pattern.compile("^[0-9]+$");
		Matcher m = p.matcher(cardNumber);
		if (!m.matches()) {
			throw new NumberFormatException("Input contains non-numeric value");
		}
		
		boolean res = validateCreditCardNumber(cardNumber);
		if (res == true) {
			System.out.printf("Credit Card Number %s is valid\n", cardNumber);
		} else {
			System.out.printf("Credit Card Number %s is invalid\n", cardNumber);
		}
	}


	public static boolean validateCreditCardNumber(String ccn) {

		boolean res = false;
		int cardLen = ccn.length();
		
		boolean isSecondDigit = false;
		int sum = 0;
		for (int i=cardLen-1; i>=0; i--) {
			int digit = Character.getNumericValue(ccn.charAt(i));
			System.out.println(digit);
			
			if (isSecondDigit) {
				digit = 2*digit;
				sum += (digit/10 + digit %10);
			} else {
				sum += digit;
			}

			isSecondDigit = !isSecondDigit;
		}
		
		if (sum%10 == 0) {
			res = true;
		} else {
			res = false;
		}

		return res;
	}
}