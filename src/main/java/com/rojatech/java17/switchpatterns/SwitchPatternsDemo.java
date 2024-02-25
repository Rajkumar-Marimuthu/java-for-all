package com.rojatech.java17.switchpatterns;

public class SwitchPatternsDemo {

	public static double getPermimeter(Shape shape) {
		if (shape instanceof Circle c) {
			return 2*Math.PI*c.radius();
		} else if (shape instanceof Rectangle r) {
			return 2 * (r.length()+r.width());
		}
		return 0;
		
	}
	
	// it is preview features
	/*
	 * 
	 * public static double getPermimeterV2(Shape shape) { return switch (shape) {
	 * case Circle c -> 2 * Math.PI * c.radius(); case Rectangle r -> 2 * r.length()
	 * * r.width(); default -> 0.0; }; }
	 */
	
	// it is preview features
	/*
	 * public static void nullSupport(Object obj) { switch(obj) { case String s ->
	 * System.out.println(s); case null -> System.out.println("unknown"); default ->
	 * System.out.println("default"); } }
	 */
	
	public static void main(String[] args) {
		Shape s = new Rectangle(4,5);
		System.out.println(SwitchPatternsDemo.getPermimeter(s));
		System.out.println(SwitchPatternsDemo.getPermimeter(new Circle(5)));
	}
}
