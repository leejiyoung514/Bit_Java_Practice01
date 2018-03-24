package com.javaex.problem04;

import java.util.Scanner;

public class Q4 {
//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int max = 0;

		for (int cnt = 0; cnt < 5; cnt++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();

			if (num > max) {
				max = num;

			}
		}
		System.out.println("최대값은 " + max + "입니다.");
		sc.close();
	}
}
