package com.nathan.ojb.bmi;

/**
 * BodyMassIndex: Tue,20150908
 * 
 * @author Nathan
 */
public class BodyMassIndex {
	public static void main(String[] args) {
		double weight = 55;
		double height = 1.65;
		double bmi = weight / (height * height);

		if (bmi < 18.5) {
			System.out.println("You are under weight");
		} else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("You are normal hurray");
		} else if (bmi >= 25 && bmi < 30) {
			System.out.println("You are over weight");
		} else if (bmi >= 30) {
			System.out.println("You are OBESE");
		} else {
			System.out.println("Incorrect bmi");
		}
	}

}
