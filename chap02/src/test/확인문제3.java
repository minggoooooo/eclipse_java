package test;

import java.util.Scanner;

public class Ȯ�ι���3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("[�ʼ� ���� �Է�]");
		System.out.print("1. �̸�: ");
		String name = sc.next();
		System.out.print("2. �ֹι�ȣ �� 6�ڸ�: ");
		String birthDay = sc.next();
		System.out.print("3. ��ȭ��ȣ(-�� �־��ּ���): ");
		String phoneNumber = sc.next();
		
		System.out.printf("%s�� �ֹι�ȣ�� %s�̰� ����ó�� %s�Դϴ�.",name,birthDay,phoneNumber);
		
		//����� printf ȫ�浿�� �ֹι�ȣ�� 123456 �̰� ����ó�� 010-1234-1234�Դϴ�.
	}

}
