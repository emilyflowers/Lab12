/**
* File: Lab12Prob02.java
* Class: CSCI 1302
* Author: Emily Flowers, Natalia Mar Morales
* Created on: Nov 21, 2025
* Last Modified: Nov 21, 2025
* Description: Create a recursive method
*/

public class Lab12Prob02 {
	public static void main(String[] args) {
		
	}

	public static String reverseString(String str) {
		if (str.length() == 1) {
			return str;
		} else {
			return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
		}
	}
}
