package com.rojatech.ch09.others;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challenge1 {
	public static void main(String args[]) {
		Order1 order = new Order1("cola", LocalDateTime.now());
		
		System.out.println("Not empty: " + OrderUtil1.getOrdersAfterDate(Arrays.asList(order), LocalDateTime.of(20,8,10,8,25,15)));
		
		System.out.println("Empty: " + OrderUtil1.getOrdersAfterDate(Arrays.asList(order), LocalDateTime.now()));
	}

}

class OrderUtil1 {
	public static ArrayList<Order1> getOrdersAfterDate(List<Order1> orders, LocalDateTime date){
		ArrayList<Order1> result = new ArrayList<>();
		
		for(Order1 order: orders) {
			if (order.getDate().isAfter(date)) {
				result.add(order);
			}
		}
		return result;
	}
}
	
class Order1 {
	String name;
	LocalDateTime date;
	
	public Order1(String name, LocalDateTime date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", date=" + date + "]";
	}
}