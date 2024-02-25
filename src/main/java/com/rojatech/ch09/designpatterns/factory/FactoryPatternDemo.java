package com.rojatech.ch09.designpatterns.factory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class Plan {
	protected double rate;
	abstract void getRate();
	
	public void calculateBill(int unit) {
		System.out.println(rate + " * " + unit + " = " + unit*rate); 
	}
}

class DomesticPlan extends Plan {
	@Override
	void getRate() {
		rate = 2.50;
	}	
}

class CommercialPlan extends Plan {
	@Override
	void getRate() {
		rate = 7.50;
	}	
}

class InstitutionalPlan extends Plan {
	@Override
	void getRate() {
		rate = 5.0;
	}	
}

class PlanFactory {
	
	public Plan getPlan(String planType) {
		
		if (planType == null) {
			return null;
		}
		
		if (planType.equalsIgnoreCase("domesticplan")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("commericalplan")) {
			return new CommercialPlan();
		} if (planType.equalsIgnoreCase("institutionalplan")) {
			return new InstitutionalPlan();
		}
		
		return null;
	}
	
}

public class FactoryPatternDemo {

	public static void main(String[] args) throws IOException {
		
		PlanFactory planFactory = new PlanFactory();
		
		System.out.println("Enter the name of the plan");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String planName = br.readLine();
		
		System.out.println("Enter the unit");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFactory.getPlan(planName);
		p.getRate();
		p.calculateBill(units);
	}
}
