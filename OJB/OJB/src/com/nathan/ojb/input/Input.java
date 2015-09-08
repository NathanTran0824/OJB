package com.nathan.ojb.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Input: Tue,20150908
 * 
 * @author Nathan
 */
public class Input {

	public static void main(String[] args) {
		// BufferedReader
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		try {
			System.out.println("Enter your name: ");
			String strBufferedReader = bufferedReader.readLine();
			System.out.println("Your name is " + strBufferedReader);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Scanner
		System.out.println("Enter your name: ");
		Scanner scanner = new Scanner(System.in);
		String strScanner = scanner.nextLine();
		System.out.println("Your name is " + strScanner);
	}

}
