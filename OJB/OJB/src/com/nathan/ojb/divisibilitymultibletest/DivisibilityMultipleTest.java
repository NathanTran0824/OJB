package com.nathan.ojb.divisibilitymultibletest;

/**
 * DivisibilityMultibleTest: Tue,20150908
 * 
 * @author Nathan
 */
public class DivisibilityMultipleTest {

	public static void main(String[] args) {
		int numberOne = 24;
		int numberTwo = 8;

		if ((numberOne % numberTwo) == 0) {
			System.out.println(numberOne + " is a multiple of " + numberTwo);
		} else {
			System.out.println(numberOne + " is not a multiple of " + numberTwo);
		}
	}

}
