package sec01;

import java.util.Scanner;

public class if����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("ù��° ���ڴ�?");
//		int num1 = sc.nextInt();
//		System.out.println("�ι�° ���ڴ�?");
//		int num2 = sc.nextInt();
//		sc.close();
//		
//		if(num1>num2) 
//			System.out.println("ù��° ���ڰ� Ů�ϴ�.");
//		if(num1<num2)
//			System.out.println("�ι�° ���ڰ� Ů�ϴ�.");
//		if(num1==num2)
//			System.out.println("�� ���ڰ� �����ϴ�.");
		System.out.println("������ �Է��ϼ���.");
		int score = sc.nextInt();
		
		if(score>=50) {
			System.out.println("�հ��Դϴ�.");
		} else {
			System.out.println("������� ������.");
		}
	}

}