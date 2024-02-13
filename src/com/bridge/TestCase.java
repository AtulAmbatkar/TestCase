package com.bridge;

import java.util.Scanner;

public class TestCase {

	public static  void main(String[] args) {
		
		Integer x =30, y = 10,  z=20;
		
		findMaxmim(x,y,z);
		
	}
	
	private static void toPrint(Integer max) {
		System.out.println("maxMimunNumber: " + max);
	}

	private static void findMaxmim(Integer x, Integer y, Integer z) {
		
		Integer max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		toPrint(max);
	}

}
