package sec04;

import java.util.Scanner;

public class ��ĳ�ʿ��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("����� ��й�ȣ�� �Է��ϼ���.");
		 * 
		 * String a = sc.nextLine();
		 * 
		 * while(true) if(a.equals("1234")) { System.out.println("ȯ���մϴ�."); break; }
		 * else {System.out.println("��й�ȣ�� Ʋ���ϴ�."); String b = sc.nextLine();
		 * if(b.equals("1234")) {System.out.println("ȯ���մϴ�."); {break; }
		 * 
		 * } } ��������� ���� �����
		 */
		while(true) {
			System.out.println("����� ��й�ȣ�� �Է��ϼ���");
			String password = sc.nextLine();
			if(password.equals("1234")) {
				System.out.println("ȯ���մϴ�.");
				break;
			}
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}

}
