package com.rojatech.java13.switchexpression;

public class SwitchExpressionDemo {

	public static void main(String[] args) {
		int key = 1;
		String result = switch (key) {
		case 1: {

			yield "Choice 1";
		}
		default:
			yield "Invalid choice";
		};
		System.out.println(result);

		int choice = 1;
		String response = switch (choice) {
		case 1 -> {
			yield "you have zero balance";
		}
		case 2 -> {
			yield "you can get a loan";
		}
		default -> {
			yield "invalid choice";
		}
		};
		System.out.println(response);
	}
}
