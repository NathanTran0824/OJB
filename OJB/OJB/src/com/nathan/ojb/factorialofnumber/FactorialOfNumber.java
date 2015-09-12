package com.nathan.ojb.factorialofnumber;

public class FactorialOfNumber {

	public static void main(String[] args) {
		long prod = 1;
		for (int i = 1; i <= 10; i++) {
			prod = prod * i;
		}
		System.out.println(prod);
	}

}
