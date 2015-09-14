package com.nathan.ojb.decimaltobinary;

import java.io.BufferedReader;

/**
 * DecimalToBinary: Tue,20150908
 * 
 * @author Nathan
 */
public class DecimalToBinary {

	public static void main(String[] args) {
		int decimal = 14;
		String binary = Integer.toBinaryString(decimal);
		System.out.println(binary);

		StringBuffer buffer = new StringBuffer();
		while (decimal != 0) {
			int digit = decimal % 2;
			buffer.append(digit);
			decimal = decimal / 2;
		}
		buffer.reverse();
		System.out.println(buffer);
	}

}
