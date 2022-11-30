package com.bridgelabz.generics;

public class MaxInteger {
	public static Integer compareTo(Integer a, Integer b, Integer c) {
		if (a > b && a > c) {
			return a;
		} else if (b > c) {
			return b;
		} else {
			return c;
		}
	}

	public static void main(String[] args) {
		System.out.println("Maximum Integer Number is: " + MaxInteger.compareTo(15, 32, 45));
	}

}
