package com.javaex.problem06;

import java.util.Scanner;

public class Q66 {

	public static void main(String[] args) {
		int startNum;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		
		
		if(num%2==0) {
			startNum=2;
		}else {
			startNum=1;
		}
		for(int i=startNum; i<=num; i=i+2 ) {
			sum=sum+i;
		}
		
		System.out.println("결과값: " + sum);
		sc.close();

	}

}
