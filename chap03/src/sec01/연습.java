package sec01;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x�� �ʱⰪ�� �Է��� �ּ���");
		int x = sc.nextInt();

		System.out.println("y�� �ʱⰪ�� �Է��� �ּ���");
		int y = sc.nextInt();

		System.out.println("���� ��ȣ�� �Է��� �ּ���");
		String a = sc.next();

		if (a.equals("+")) {
			++x;
		} else {
			--y;
		}
		System.out.printf("x: %d y: %d",x,y);
	}

}
