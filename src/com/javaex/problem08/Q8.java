package com.javaex.problem08;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int select, deposit, withdraw, balance=0;
		

		while (run) {

			System.out.println("---------------------------------------");
			System.out.println("   1.예금 | 2.출금 | 3.잔고 | 4.종료   ");
			System.out.println("---------------------------------------");
			System.out.print("선택>");
			select = sc.nextInt();

			if (select == 4) {
				System.out.println("프로그램 종료");
				break;
			} else {
				switch (select) {

				case 1:
					System.out.print("예금액>");
					deposit = sc.nextInt();
			        balance+=deposit;
					continue;
				case 2:
					System.out.print("출금액>");
					withdraw = sc.nextInt();
					balance-=withdraw;
					continue;
				case 3:
					System.out.println("잔고액>"+balance);
					continue;
				default:
					System.out.println("다시 입력해주세요");
				}
			}
		}
		sc.close();
	}
}