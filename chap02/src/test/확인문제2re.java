package test;

import java.util.Scanner;

public class 확인문제2re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 수 :");
		String strNum1 = sc.next();
		System.out.println("두 번째 수 :");
		String strNum2 = sc.next();

		sc.close();
		

		if (strNum1.equals(strNum2)) {
			System.out.println("두 수가 같아요");
		} else {
			System.out.println("두 수가 달라요");
		}

	}

}
