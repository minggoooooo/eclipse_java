package test;

import java.util.Scanner;

public class Ȯ�ι���1n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸���?");
		String name = sc.next();
		System.out.println("�߰���� ������?");  //��) 83.67 �� �Ҽ������� �ֱ�
		double middleExamScore = sc.nextDouble();
		System.out.println("�⸻��� ������?");
		double lastExamScore = sc.nextDouble();
		System.out.println("����Ʈ ������?");
		double reportScore = sc.nextDouble();
		
		
		double finalScore= (middleExamScore+lastExamScore+reportScore)/3;
		
		sc.close();
		// Printf ��� �ѹ��� ����ϴ� �� ����
		// ȫ�浿���� ��� ������ : 73.25 �Դϴ�.
		
		System.out.printf("%s���� ��� ������ : %5.2f �Դϴ�.",name,finalScore);
	}

}
