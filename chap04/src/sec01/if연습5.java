package sec01;

import java.util.Scanner;

public class if����5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("���� ������ �Է��Ͻʽÿ�");
		int num = sc.nextInt();
		sc.close();
		
		if(num<8) {
			System.out.println("��ǰ ����:" + num);
			System.out.println("������ " + (num*7000) + "�� �Դϴ�.");
		} else {
			System.out.println("��ǰ ����:" + num);
			System.out.println("������ " + (int)(num*7000*0.9) + "�� �Դϴ�.");
		}
	}

}
