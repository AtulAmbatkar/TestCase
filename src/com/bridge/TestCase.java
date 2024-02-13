package com.bridge;

import java.util.Scanner;

public class TestCase {

	public static  void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the Intger size in between (1,10): ");
		int number = scn.nextInt();
		
		int[] input = new int[number];
		
		System.err.print("Enter Integer to find Maximum number " + number + ": ");
		
		for(int i=0 ; i<input.length; i++) {
			int a = scn.nextInt();
			input[i] = a;
		}
		
		maximum(input);
		System.out.println("maximumNumber: " + input[0]);
	}
	private static void maximum(int[] input) {
		
		int max = input[0];
		for(int i=1; i<input.length; i++) {
			if(max < input[i]) {
				max = input[i];
			}
		}
		input[0] = max;
	}

}
