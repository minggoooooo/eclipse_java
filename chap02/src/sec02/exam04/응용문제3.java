package sec02.exam04;

import java.util.Scanner;

public class ���빮��3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
				System.out.println("�ǹ��� �������� �ֳ���??");
				int a = s.nextInt();
						System.out.println("�ִ� �ǹ� ���̿� \"x \" m�� ������ �ִ� ���� �ο��� �ȴ�. x���� �Է��Ͻÿ�?");
						int b = s.nextInt();
								int div = a/b;
								int c= a*5;
								int d= c/3;
					System.out.println("�Է��Ͻ� �ǹ��� ��ü " + c +"m �̰� �ִ�����ο��� " + d + "���Դϴ�");			
	}

}
