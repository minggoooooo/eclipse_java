package ����;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("���� �ð��� �Է��ϼ���");

		int hour = sc.nextInt(); // �ð�

		int minute = sc.nextInt(); // ��

		int addTime = sc.nextInt(); // �ѽð��� ������

		sc.close();

		int d = addTime / 60; // �� �� �ð� hour+ d�� 24�� �Ѿ�ٸ� ����� - 24 �������
		int e = addTime % 60; // �� �� ��
		
		hour = hour+d;
		minute = minute+e;
		if (minute >= 60) {
			minute= minute-60;
			hour = hour+1;
		}
		if(hour>=24) {
			hour = hour-24;
		}
		System.out.printf("%d %d",hour,minute);
	}
}

		/*if (0 <= hour | hour <= 23 && 0 <= minute | minute <= 59 && 0 <= addTime | addTime <= 1000) {
			if (hour + d >= 24 && minute + e >= 60) {
				System.out.print(hour + d - 23 + " ");
				System.out.print(minute + e - 60);
			} else if (hour + d >= 24 && minute + e < 60) {
				System.out.print(hour + d - 24 + " ");
				System.out.print(minute + e);
			} else if (hour + d == 23 && minute + e >= 60) {
				System.out.print(hour + d + 1 + " ");
				System.out.print(minute + e - 60);
			} else if (hour + d >= 24 && minute + e >= 60) {
				System.out.print( + " ");
				System.out.print(minute + e - 60);
			} else {
				System.out.print(hour + d + " ");
				System.out.print(minute + e);
			}

		}*/
		
	
