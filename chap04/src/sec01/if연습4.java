package sec01;

import java.util.Scanner;

public class if����4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���� ������?");
		int score1 = sc.nextInt();
		System.out.println("������ ���� ������?");
		int score2 = sc.nextInt();
		System.out.println("������ ���� ������?");
		int score3 = sc.nextInt();
		sc.close();
		
		int sum = score1 + score2 + score3;
		
		if(score1<=6 || score2<=6 ||score3<=6 || sum <30) {
			System.out.println("���հ��Դϴ�.");
		} else {
				System.out.println("�հ��Դϴ�.");
		}
		
	}

}
