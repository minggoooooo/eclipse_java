package test;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ���� �Է��ϼ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(a>b) {System.out.println("���� ��� : " + (a-b));
	} else {System.out.println("���� ��� : "+ (a+b));
	}
	}

}
