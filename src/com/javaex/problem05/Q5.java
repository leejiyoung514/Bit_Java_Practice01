package com.javaex.problem05;

public class Q5 {

//1   2   3   4   5   6   7   8   9   10
//2   3   4   5   6   7   8   9   10  11
//3   4   5   6   7   8   9   10  11  12	
//.......................................
//10  11  12  13  14  15  16  17  18  19
	
public static void main(String[] args) {
		for (int a = 1; a <= 10; a++) {
			for (int b = 0; b < 10; b++) {
				System.out.print(a + b);
				System.out.print("\t");
			}
			System.out.println(" ");
		}
	}
}
