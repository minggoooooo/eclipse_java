package sec03.exam07;

import java.util.Scanner;

public class ����620 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �׼��� �Է��Ͻʽÿ�.");
		int a = s.nextInt();
		int b = (int)a/50000; //14��
		int c = a%50000; //48700
		int d = (int)c/10000; //4��
		int e = c%10000; //8700
		int f = (int)e/5000; // 1��
		int g = e%5000; // 3700
		int h = (int)g/1000;// 3��
		int i = g%1000; // 700
		int j = (int)i/500;// 1��
		int k = i%500;// 270
		int l = (int)k/100; //2��
		int m = k% 100; // 0
		int n = m/10;
		
		
		//748770���� 5������ 14�� ������ 4�� 5õ���� 1�� õ���� 3�� 500���� 1�� 100���� 2����.
		
		System.out.println("�Է��Ͻ� ���� �׼��� 5�������� �� " + b +"��");
		System.out.println("1�������� �� " + d + "�� " );
		System.out.println("5õ�� ���� �� " + f + "�� ");
		System.out.println("1õ�� ���� �� "+ h + "�� ");	
		System.out.println("500�� ������" + j +" �� ");
		System.out.println("100�� ������" + l +" �� ");
		System.out.println("10�� ������" + n + "��");
				
		
		//�̷��� �ص� �ǰ� 
		//int money= s.nextInt();
		//System.out.println("�������� : " + money / 50000 + "��");
		//money = money % 50000;
		//System.out.println("������ : " + money / 10000 + "��");
		//money = money % 10000; .... �̷��� �� �̾�� �ȴ�. �̰� ����
	}

}
