package sec01;

import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("�л��� �� ����Դϱ�?");
		// int student = sc.nextInt();
		// System.out.println("������ �� ��Դϱ�?");
		// int pencil = sc.nextInt();

		// int a = pencil / student;
		// int b = pencil % student;
		// System.out.printf("�л� �� ��� %d���� ������ �������� %d���� ���ƿ�", a, b);

		System.out.println("�� �л� ����?");
		int x = sc.nextInt();
		System.out.println("�� �ٿ� ��� �ɳ���?");
		int y = sc.nextInt();

		int a = x % y;
		int b = (int) (x / y);
		int c = y - a;
//		int result = (a == 0) ? b : b + 1; // result�� ��
//		int result2 = (a == 0) ? a : y - a; // result2�� ������
//		System.out.printf("�� %d���̰�\n���� �¼����� %d�� �Դϴ�.", result, result2);
//		
		// a==0 a!=0�� ������
		// if�� �ۼ��ؼ� a==0���� �׳� �����ְ� ���� b �����¼��� a���ؼ� ����� �ǰ�
		// else������ b+1 y-a ��

		if (a == 0) {
			System.out.printf("�� %d���̰�\n���� �¼����� %d�� �Դϴ�.", b, a);

		} else {
			System.out.printf("�� %d���̰� \n���� �¼����� %d�� �Դϴ�.", b + 1, c);
		}
	}
}
