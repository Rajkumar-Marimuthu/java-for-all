package com.rojatech.javachallenges.array;

public class MaxProfitOnStockBuySell {

	public static void main(String[] args) {
		int[] prices = {7, 1, 5, 3, 6, 4};
		
		int buyPrice = prices[0];
		int sellPrice = prices[1];
		
		for (int i=0; i<prices.length; i++) {
			if (prices[i] < buyPrice) {
				buyPrice=prices[i];
			}
			if (prices[i] > buyPrice && prices[i] > sellPrice) {
				sellPrice = prices[i];
			}
		}
		int profit = sellPrice-buyPrice;
		System.out.println(profit);
		
	}

}
