package sec02.exam04;

import java.util.Scanner;

public class ���빮��4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("������ ������?");
		String name = s.next();
		System.out.println("������ ���̴�?");
		int age = s.nextInt();

		if (age < 20) {
			System.out.println(name + "���� û���Դϴ�.");
			

		} else {
			System.out.println(name + "���� ����Դϴ�.");
		}

	}
}
