package test;

import java.util.Scanner;

public class Ȯ�ι���2re {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° �� :");
		String strNum1 = sc.next();
		System.out.println("�� ��° �� :");
		String strNum2 = sc.next();

		sc.close();
		

		if (strNum1.equals(strNum2)) {
			System.out.println("�� ���� ���ƿ�");
		} else {
			System.out.println("�� ���� �޶��");
		}

	}

}
