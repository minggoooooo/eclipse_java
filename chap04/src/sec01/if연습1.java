package sec01;

import java.util.Scanner;

public class if����1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = sc.next();
		System.out.println("����� ������?");
		int score = sc.nextInt();
		sc.close();
		
		if(score>=70) {
			System.out.println(name + "���� �հ��Դϴ�.");
		} else {
			System.out.println(name + "���� ���հ��Դϴ�.");
		}

	}

}
