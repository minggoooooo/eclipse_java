package test;

import java.util.Scanner;

public class Ȯ�ι���2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° �� :");
		String strNum1 = sc.next();
		System.out.println("�� ��° �� :");
		String strNum2 = sc.next();

		sc.close();

		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result;
		if (num1 > num2) {
			result = num1 - num2;
			System.out.println("���� ���:" + result);
		} else {
			result = num1 + num2;
			System.out.println("���� ���:" + result);
		}

	}

}
