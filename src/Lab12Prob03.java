/**
* File: Lab12Prob03.java
* Class: CSCI 1302
* Author: Emily Flowers, Natalia Mar Morales
* Created on: Nov 21, 2025
* Last Modified: Nov 21, 2025
* Description: Create a recursive method
*/

public class Lab12Prob03 {
	public static void main(String[] args) {
		System.out.println(reverseString("dogs"));
	}

	public static String reverseString(String str) {
			return reverseString(str, str.length() - 1);
		
	}	
	
	public static String reverseString(String str, int n) {
		if (n == 0) {
			return str;
		} else {
			return str.charAt(n) + reverseString(str.substring(0, str.length() - 1), n - 1);
		}
	}
}
