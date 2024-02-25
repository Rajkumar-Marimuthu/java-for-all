package com.rojatech.ch09.others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Challenge {
	public static void main(String args[]) {
		Order order = new Order("cola", new Date());
		System.out.println(new Date(20,8,10));
		System.out.println("Not empty: " + OrderUtil.getOrdersAfterDate(Arrays.asList(order), new Date(20,8,10)));
		
		System.out.println("Empty: " + OrderUtil.getOrdersAfterDate(Arrays.asList(order), new Date()));
	}

}

class OrderUtil {
	public static ArrayList<Order> getOrdersAfterDate(List<Order> orders, Date date){
		ArrayList<Order> result = new ArrayList<>();
		
		for(Order order: orders) {
			if (order.getDate().compareTo(date)<0) {
				continue;
			}
			result.add(order);
		}
		return result;
	}
}
	
class Order {
	String name;
	Date date;
	
	public Order(String name, Date date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", date=" + date + "]";
	}
	
	
}