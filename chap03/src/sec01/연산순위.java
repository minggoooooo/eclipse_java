package sec01;

import java.util.Scanner;

public class ������� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		int num2 = sc.nextInt();

		// ���� �����ڸ� ����Ͽ� �� ���� ���� 50�̻��̸� "���" �ƴϸ� "Ż��"�� ����ϱ�

		int sum = num1 + num2;
		String result = (sum >= 50) ? "���" : "Ż��";
		System.out.println(result);
		
	}

}
