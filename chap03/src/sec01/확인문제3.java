package sec01;

import java.util.Scanner;


public class Ȯ�ι���3 {
	public static void main(String[] args) {
		// 1�� ����
		byte b = 5;
		b = (byte) -b; // byte�� ���� ���� ����.
		int result = 10 / b;
		System.out.println(result);

		// 2�� ����
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); // 31

		// 4�� ����
		int pencils = 534;
		int students = 30;

		// �л� 1���� ������ ���� ����
		int pencilPerStudent = pencils / students;
		System.out.println(pencilPerStudent);

		// ���� ���� ����
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);

		// 5�� ����
		int var1 = 5;
		int var2 = 2;
		double var3 = (double) var1 / var2; // ���� ���� 2�� ���ͼ� �ȴ� �տ� ���� ���̸� 5�� �˴ϴ�
		int var4 = (int) (var3 * var2);
		System.out.println(var4);

		// 6�� ����
		int value = 356; // ���� �ڸ� ���ϸ� ������ ����?
		System.out.println(value - (value % 100));

		// 8������
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double) (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
		
		// 10������
		Scanner sc = new Scanner(System.in);
		System.out.println("���̵�: ");
		String name = sc.nextLine();
		
		//11�� ����
		System.out.println("�н�����: ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		sc.close();
		
		if(name.equals("java")) {
			if(password==12345) {
				System.out.println("�α��� ����");
			} else {
				System.out.println("�α��� ����:�н����尡 Ʋ��");
			}
		} else {
			System.out.println("�α��� ����:���̵� �������� ����");
		}
		//12�� ����
		int a = 10;
		int c = 5;
		System.out.println((a>7) && (c<=5)); //true
		System.out.println((a%3 == 2) || (c%2 != 1)); //false
		
		//13�� ����
		int value1 = 0;
		value1+=10;
		System.out.println(value1);
		value1-=10;
		System.out.println(value1);
		value1*=10;
		System.out.println(value1);
		value1/=10;
		System.out.println(value1);

	}

}
