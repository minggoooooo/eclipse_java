package sec02.exam04;

import java.util.Scanner;


public class scannerex1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ ������ �ֽʽÿ�.");

		String food = s.next();
		
		System.out.println("�ݾ��� �־��ֽʽÿ�.");

		int price = s.nextInt();

		System.out.println(food + "�� " + "�Ž������� " + (10000-price) + "�� �Դϴ�.");
		//���� �ȵǱ� �ص� �ϳ��� �� ������.
	}

}
