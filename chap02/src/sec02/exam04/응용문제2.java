package sec02.exam04;

import java.util.Scanner;

public class 응용문제2 {
	public static void main(String[] args) {
		
	

/*	public static void main(String[] args) { // ctrl + shift + o 자바의 유틸 불러오기
		Scanner s = new Scanner(System.in);
		System.out.println("두 개 숫자를 입력하세요.");
		System.out.println("첫 번째 숫자는 무엇인가요?");
		int a = s.nextInt();
		System.out.println("두 번째 숫자는 무엇인가요?");
		int b = s.nextInt();

		int div = a / b;
		System.out.println("입력하신 두 수를 나눈 결과는 : " + div + "입니다." );
	}*/
	Scanner s = new Scanner(System.in);
	 System.out.println("두 개 숫자를 입력하세요.");
 	System.out.println("첫 번째 숫자는 무엇인가요?");
	double a = s.nextInt();
	System.out.println("두 번째 숫자는 무엇인가요?");
	double b = s.nextInt();
	
	double div = a / b;
	System.out.println("입력하신 두 수를 나눈 결과는 : " + div + "입니다." );
}

}

