package sec01;

import java.util.Scanner;

public class if����3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻʽÿ�");
		int num = sc.nextInt();
		sc.close();

		if (num % 2 == 0 && num % 5 == 0 && num != 0) {
			System.out.println("2�� 5�� ����Դϴ�.");
		} else {
			System.out.println("2�� 5�� ����� �ƴմϴ�.");
		}

		if (num % 2 == 0) {
			System.out.println(num + "��(��) ¦���Դϴ�.");
		} else {
			System.out.println(num + "��(��) Ȧ���Դϴ�.");
		}
	}

}
