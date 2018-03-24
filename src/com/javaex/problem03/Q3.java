package com.javaex.problem03;

public class Q3 {
//구구단 출력 
	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 2; b< 10; b++) {
				System.out.print( b+ "*" + a + "=" + (  b * a  ));
				System.out.print("\t");
			}
			System.out.println(" ");
		}

	}

}
