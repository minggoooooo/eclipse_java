package sec03.exam03;

import java.util.Scanner;

public class ��������ϱ� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int a = s.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int b = s.nextInt();
		System.out.println("�����ȣ�� �Է��ϼ���(*,/)");
		String c = s.next();
		char d = c.charAt(0);
		// int e = a * b;
		// double f = (double) a/ b; // a*b �ڸ��� e , (double)a/b�� f�� �־ ��.
		// c =="*" if������ ���� �ȵ� why? 

		if (d == '*') {
			System.out.println("�Է��Ͻ� ������ �����" + (a * b) + " �Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ������ �����" + ((double) a / b) + " �Դϴ�.");
		}
	}

}
