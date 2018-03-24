package com.javaex.problem07;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 100) + 1; // 랜덤숫자

		Scanner sc = new Scanner(System.in);
		boolean run = true;

		while (run) {
            String str;
			System.out.println("=================================");
			System.out.println("      [숫자맞추기게임 시작]      ");
			System.out.println("=================================");

			while (run) {

				System.out.print(">>");
				int find = sc.nextInt(); // 찾을 정수 입력받기

				if (num == find) {
					System.out.println("맞았습니다. ");
					break;
				} else if (num > find) {
					System.out.println("더 높게");
				} else {
					System.out.println("더 낮게");
				}
			}

			System.out.print("게임을 종료하시겠습니까?(y/n) >> ");
			str=sc.next();
			if("n".equals(str)) {
				continue;
			}else {
				System.out.println("=================================");
				System.out.println("      [숫자맞추기게임 종료]      ");
				System.out.println("=================================");
				break;
			}
		}
		sc.close();	
	}
}
