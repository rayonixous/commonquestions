package com.common.programming.questions;

public class IntegerOperations {
	static String swapNumbers(int a, int b) {
		String result="";
		
		a= a+b;
		b= a-b;
		a= a-b;
	
		result="the swapped result is: "+a+" "+b;
		return result;
	}
}
