package sec03.exam07;

import java.util.Scanner;

public class ���ڿ����⺻Ÿ�����κ�ȯ {

	public static void main(String[] args) {
		// �� ���� �Է¹޽��ϴ�. �� next() �̿��Ͽ� ���ڿ��� �Է¹���.
		// �Է¹��� ���ڿ��� Integer.parseInt �̿��Ͽ� ���ڷ� ����ȯ�ϱ�.
		// �� ������ �հ� ����ϴ� ����.

		Scanner s = new Scanner(System.in);

		System.out.println("ù��° ���ڸ� �Է��ϼ���.");

		String a = s.next();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		String b = s.next();

		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		//Integer.parseInt ���ڿ�->����(int)
		//String.valueOf(Ÿ�԰�) Ÿ�԰�->����
		int e = c + d; //e�� �־ ��.
		System.out.println("�� ���� �հ�� : " + (c + d) + "�Դϴ�.");

	}

}
