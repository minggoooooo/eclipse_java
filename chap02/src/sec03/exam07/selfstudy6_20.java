package sec03.exam07;

import java.util.Scanner;


public class selfstudy6_20 {
	public static void main(String[] args) {
		//String str = String.valueOf(�⺻Ÿ��) Stirng to�� �����ؿ�
		Scanner s=new Scanner(System.in);
		System.out.println("������ �ܾ ��������");
		String a = s.next();
		System.out.println("ù ������ �����ڵ��" + (int)a.charAt(0) + ", �� ��° ������ �����ڵ��" + 
		(int)a.charAt(1) + ", ������ ������ �����ڵ��" + (int)a.charAt(2) +" �̴�.");
		
		System.out.println("������ ���� 3������ ��������(��, ���� �Ҽ� ���� ������)");
		int b = s.nextInt();
		float c = s.nextFloat();
		short d = s.nextShort();
		
		System.out.println("�� ���� ���� ������ ���� ������ ǥ���Ͽ���(*,/)");
		
		String e= s.next();
		
		if (e.equals("*")) {System.out.println(b*c*d);
		}else {System.out.println((b/c/d));
		}
	}

}
