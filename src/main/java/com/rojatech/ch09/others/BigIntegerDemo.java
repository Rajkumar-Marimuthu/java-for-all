package com.rojatech.ch09.others;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigInteger;

import java.io.InputStreamReader;

public class BigIntegerDemo {

	
	public static void main(String[] args) {
	
		String str = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			str = br.readLine();
			BigInteger bia = new BigInteger(str);
			
			str = br.readLine();
			BigInteger bib = new BigInteger(str);
			
			BigInteger ans = bia.add(bib);
			
			BigInteger mul = bia.multiply(bib);
			
			System.out.println(ans);
			System.out.println(mul);
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		

	}

}
