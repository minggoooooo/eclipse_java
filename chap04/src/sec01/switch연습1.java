package sec01;

import java.util.Scanner;

public class switch����1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = sc.next();
		System.out.println("����� �г���?");
		int grade = sc.nextInt();
		sc.close();

		switch (grade) {
		case 1:
			System.out.println(name + "���� 1�г��Դϴ�.");
			break;
		case 2:
			System.out.println(name + "���� 2�г��Դϴ�.");
			break;
		default:
			System.out.println(name + "���� 3�г��Դϴ�.");
			break;
		}

	}

}
