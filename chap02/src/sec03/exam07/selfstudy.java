package sec03.exam07;

import java.util.Scanner;



public class selfstudy {
	public static void main(String[] args) {
		
		int a = 100;
		String b = String.valueOf(a); //String.valueof(x) x������ ���� String, �� ���ڿ��� �ٲߴϴ�.
		

		
		Scanner s=new Scanner(System.in);
		
		System.out.println("ù��° ���� ����� �Է��ϼ���");
		String c = s.next();
		
		if (c.equals("A")) {System.out.println("����� ������ 4.0�Դϴ�.");
		}else if (c.equals("B")) {System.out.println("����� ������ 3.0�Դϴ�.");
		}else if (c.equals("C")) {System.out.println("����� ������ 2.0�Դϴ�.");
		}else {System.out.println("������ϼ���"); //x.equals(?)�� �� ����صѰ� String x�� ���� ?��� ���� ������ true �ƴϸ� false�� �ҷ���
		
		}
		
		
		
		
				
				
		System.out.println(b+a);
	}

}
