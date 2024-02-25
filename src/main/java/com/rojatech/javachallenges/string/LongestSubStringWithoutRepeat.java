package com.rojatech.javachallenges.string;

public class LongestSubStringWithoutRepeat {

	public static void main(String[] args) {
		// Example 1:
		// Input: "ABCDEFGABEF"
		// Output: 7
		// Explanation: The longest substring without repeating characters are "ABCDEFG", "BCDEFGA", and "CDEFGAB" with lengths of 7

		// Example 2:
		// Input: "GEEKSFORGEEKS"
		// Output: 7
		// Explanation: The longest substrings without repeating characters are "EKSFORG" and "KSFORGE", with lengths of 7

		//String s = "ABCDEFGABEF";
		String s = "XUYTWDTAYUITERaSD";
		int n = findLongestSubstring(s);
		System.out.println(n);
	}

	public static int findLongestSubstring(String s) {
		if (s.isEmpty()) {
			return 0;
		}

		if (s.length() == 1) {
			return 1;
		}

		int maxLength = 0;
		boolean[] visited = new boolean[256];
		int l=0, r=0;

		while (r < s.length()) {
			if (visited[s.charAt(r)]) {
				while(visited[s.charAt(r)]) {
					visited[s.charAt(l)] = false;
					l++;
				}
			}

			visited[s.charAt(r)] = true;
			System.out.println(maxLength + " " + l + " " + r + " " + s.substring(l, r+1));
			maxLength = Math.max(maxLength, (r-l+1));
			r++;
		}

		for (boolean b : visited) {
			System.out.print(b + " ");
		}

		System.out.println();
		return maxLength;
	}

}
