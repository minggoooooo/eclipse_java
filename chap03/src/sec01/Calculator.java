package sec01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("���� 2���� �Է� �ϼ���");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("�����ڸ� �Է��ϼ���");
		String c= sc.next();
		int temp;
		int result;
		double result2;
		if(b>a) {
			temp=a; //a��3 b�� 5�϶� temp�� 3�� �ư�
			a=b; // a��b b�� ���� a�� 5���ư�
			b=temp;  //b�� temp�� ���� 3�̵�}
		}
		
		if(c.equals("+")){ 
		 result= a+b;
		 System.out.println("�� ���� �հ�� : " + result + "�Դϴ�.");
		}
		if(c.equals("-")){ 
		 result= a-b;
		 System.out.println("�� ���� ������ : " + result + "�Դϴ�.");
		}
		if(c.equals("*")){ 
		 result= a*b;
		 System.out.println("�� ���� ���� : " + result + "�Դϴ�.");
		}
		if(c.equals("/")){ 
		 result2= a/b;
		 System.out.println("�� ���� ������ : " + result2 + "�Դϴ�.");
		}
		
		
//		if(c.equals("+"))
//				{System.out.println(a+b);}
//		if(a>b&&c.equals("-")) {
//			System.out.println(a-b);
//		}
//		if(a<b&&c.equals("-")) {
//			System.out.println(b-a);
//		}
//		if(c.equals("*")) {
//			System.out.println(a*b);
//		}
//		if(a>b&&c.equals("/")) {
//			System.out.println((double)a/b);
//		}
//		if(a<b&&c.equals("/")) {
//			System.out.println((double)b/a);
//		}
	}

}
