package test;

import java.util.Scanner;

public class Ȯ�ι���1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = sc.next();
		System.out.println("����� ���̴�?");
		int age = sc.nextInt();
		System.out.println("����� �޴��� ��ȣ ��� 4�ڸ���?");
		String middleNumber = sc.next();
		System.out.println("����� �޴��� ��ȣ �� 4�ڸ���?");
		String lastNumber = sc.next();
		sc.close();
		
		System.out.println("�̸� : "+ name);
		System.out.print("���� : "+ age + "\n");
		System.out.printf("��ȭ : 010-%s-%s",middleNumber,lastNumber);
		
		//System.out.printf("�̸�: %s \n" + "����: %d \n" + "��ȭ: 010-%s-%s" ,name,age,middleNumber,lastNumber );

	}

}
