package com.core.java;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 1-10: ");
		int x = sc.nextInt();
		System.out.println("Enter a number from 1-10: ");
		int y = sc.nextInt();
		
		int z = x + y + 30;
		
		
		System.out.println("Final result: " + z);
	}

}
