package sec01;

import java.util.Scanner;

public class �����ӱ� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ٷ� �ð��� �Է��Ͻʽÿ�");
		int workHour = sc.nextInt();
		sc.close();

		int result = (int) ((workHour >= 10) ? (workHour * 1.2 * 9620) : (workHour * 9620));

		System.out.println("�� �ӱ��� " + result + "�� �Դϴ�.");

	}

}
