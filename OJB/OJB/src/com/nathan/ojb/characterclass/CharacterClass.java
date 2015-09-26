package com.nathan.ojb.characterclass;

public class CharacterClass {

	public static void main(String[] args) {
		char isDigit = '1';
		char noDigit = 'a';
		char isWhitespace = ' ';
		char noWhitespace = '1';
		System.out.println(Character.isDigit(isDigit) + " - " + Character.isDigit(noDigit));
		System.out.println(Character.isWhitespace(isWhitespace) + " - " + Character.isWhitespace(noWhitespace));

	}

}
