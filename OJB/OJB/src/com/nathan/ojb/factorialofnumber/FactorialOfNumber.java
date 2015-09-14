package com.nathan.ojb.factorialofnumber;

/**
 * FactorialOfNumber: Tue,20150908
 * 
 * @author Nathan
 */
public class FactorialOfNumber {

	public static void main(String[] args) {
		long prod = 1;
		for (int i = 1; i <= 10; i++) {
			prod = prod * i;
		}
		System.out.println(prod);
	}

}
