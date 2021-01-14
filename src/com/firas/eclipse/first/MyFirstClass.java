package com.firas.eclipse.first;

public class MyFirstClass {

	private static final String HELLO = "Hello Eclipse!";

	public static void main(String[] args) {
		System.out.println(HELLO);
		int sum = 0;
		sum = calculateSum(sum);
		System.out.println(sum);
		ArrayList<String> 1 = new ArrayList<String>();
	}

	private static int calculateSum(int sum) {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
}
