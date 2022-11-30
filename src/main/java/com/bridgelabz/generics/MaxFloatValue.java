package com.bridgelabz.generics;

public class MaxFloatValue {
	public static Double compareTo(Double a, Double b, Double c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c && b>a) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		System.out.println("Maximum float value is: " + MaxFloatValue.compareTo(55.7,68.2,32.55));
	}
}
