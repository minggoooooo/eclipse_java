package sec04;

import java.util.Scanner;

public class PrintScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���");
		
		String name = sc.next();
		
		System.out.println("���̸� �Է��ϼ���");
		
		int age = sc.nextInt();
		
		System.out.println("����\t�̸�\t����");
		System.out.printf("%-3d\t%s\t%3d\n", 1 , name, age);
	}

}
