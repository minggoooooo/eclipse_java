package sec03.exam03;

import java.util.Scanner;

public class 실수타입변환예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("중간고사 성적을 입력하세요.(50점만점)");
		double a = sc.nextDouble();

		System.out.println("기말고사 성적을 입력하세요.(50점만점)");
		double b = sc.nextDouble();

		double c = a + b;

		System.out.println("최종 점수는" + c + "입니다.");
		sc.close();
	}

}
