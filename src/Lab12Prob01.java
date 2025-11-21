/**
* File: Lab12Prob01.java
* Class: CSCI 1302
* Author: Emily Flowers, Natalia Mar Morales
* Created on: Nov 21, 2025
* Last Modified: Nov 21, 2025
* Description: Create a recursive method
*/


public class Lab12Prob01 {
	public static void main(String[] args) {
		
	}
	
	// recursive method
	public static int recursiveAbstract(int n) {
		if (n == 0) { 
			return 1;
		} else if (n == 1) {
			return 3;
		} else if (n == 2){
			return 4;
		} else {
			return recursiveAbstract(n - 3) * (recursiveAbstract(n - 2) - recursiveAbstract(n - 1));
		}
	}

}
