package sec03.exam03;

import java.util.Scanner;

public class �Ǽ�Ÿ�Ժ�ȯ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�߰���� ������ �Է��ϼ���.(50������)");
		double a = sc.nextDouble();

		System.out.println("�⸻��� ������ �Է��ϼ���.(50������)");
		double b = sc.nextDouble();

		double c = a + b;

		System.out.println("���� ������" + c + "�Դϴ�.");
		sc.close();
	}

}
