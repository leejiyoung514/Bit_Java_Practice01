package com.javaex.problem01;

public class Q1 {
	// 1에서 100까지 수에서 5의 배수이면서 7의 배수인 수를 출력하세요.
	public static void main(String[] args) {

		for (int num = 1; num < 100; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
               System.out.println(num); 
			}
		}
	}
}
