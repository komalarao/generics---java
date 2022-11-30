package com.bridgelabz.generics;


	public class Generics <T extends Comparable<T>>{ 
		T x;
		T y;
		T z;

		Generics(T x, T y, T z) {//par ameterized constructor
			this.x = x;
			this.y = y;
			this.z = z;
		}

		public T testMaximum() {// testMaximum method 3 parameter calling internally

			if (x.compareTo(y) > 0) {
				return x;
			} else if (y.compareTo(z) > 0) {
				return y;
			}
		}

		public static void main(String[] args) {
			Generics<Integer> compareInteger = new Generics<Integer>(15, 32, 45);
			System.out.println("Maximum number out of three integers is: " + compareInteger.testMaximum());
			Generics<Float> comapareFloat = new Generics<Float>(15.1F, 32.2F, 45.3F);
			System.out.println("Maximum number out of three float is: " + comapareFloat.testMaximum());
			Generics<String> compareString = new Generics<String>("Apple", "Banana", "Peach");
			System.out.println("Maximum among three string is: " + compareString.testMaximum());
		}

	}

