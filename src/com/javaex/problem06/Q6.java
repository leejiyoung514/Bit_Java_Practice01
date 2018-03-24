package com.javaex.problem06;

import java.util.Scanner;
//a.입력 받은 숫자를 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다.
// -예) 입력이 7이면 16을 출력(1+3+5+7=16)
//b.입력 받은 숫자를 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다.
// -예) 입력이 10이면 30을 출력(2+4+6+8+10=30)

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int i;

		for (i = num - 2; 0 < i; i -= 2) {
			num += i;
		}

		System.out.println("결과값: " + num);

		sc.close();

	}
}