package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
		Scanner s = new Scanner(System.in);
		System.out.println("����б��� �Է��ϼ���");
		String schoolName = s.next();
		char school = schoolName.charAt(2);
		
		System.out.println("���� ���г� �ΰ���?");
		
		int grade = s.nextInt();
		
		if (school == '��') { System.out.println("����� �ʵ��б� " + grade + "�г��Դϴ�.");
		} else if (school == '��') { System.out.println("����� ���б� " + grade + "�г��Դϴ�.");
		} 
	 else if (school == '��') { System.out.println("����� ����б� " + grade + "�г��Դϴ�.");
	} 

		


	}
}

