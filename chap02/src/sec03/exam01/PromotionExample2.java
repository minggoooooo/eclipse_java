package sec03.exam01;

import java.util.Scanner;

public class PromotionExample2 {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
		Scanner s = new Scanner(System.in);
		System.out.println("�� ���ڸ� �Է��ϼ���: ");
		String word = s.next();

		char uni = word.charAt(0); // word.charAt(x) -> x�ȿ� �ִ� ���ڴ� ��� °���� ������ ���� ���ϴ� ��.
		// �ٵ� �̻��ϰ� �ٸ� ���� ������ �ȵǳ�? �� ���ڿ��� ���°���� ���ϴ°�. ���� �������� �Է��ϸ� ��
		// word �ȿ� �ִ� ù ���ڰ� 0�� �Ǵ� ��.
		// ����� charAt(x)�� ���ڿ� �� String Ÿ���� ���ڿ��� x��° ���ڸ� charŸ������ ��ȯ�ϴ� ��.
		// toString(������) �����͸� String Ÿ������ ��ȯ.
		// charAt(����) ���ڿ��� ���ڿ� �ش��ϴ� ���ڸ� ĳ���� Ÿ������ ��ȯ.

		int intValue = uni;

		System.out.println("�Է��Ͻ� " + word + "�� �����ڵ�� ���� " + intValue + "�Դϴ�.");

	}

}
