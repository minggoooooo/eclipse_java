package test;

import java.util.Scanner;

public class 확인문제1n {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = sc.next();
		System.out.println("중간고사 점수는?");  //예) 83.67 즉 소수점까지 넣기
		double middleExamScore = sc.nextDouble();
		System.out.println("기말고사 점수는?");
		double lastExamScore = sc.nextDouble();
		System.out.println("리포트 점수는?");
		double reportScore = sc.nextDouble();
		
		
		double finalScore= (middleExamScore+lastExamScore+reportScore)/3;
		
		sc.close();
		// Printf 사용 한번에 출력하는 법 예제
		// 홍길동님의 평균 점수는 : 73.25 입니다.
		
		System.out.printf("%s님의 평균 점수는 : %5.2f 입니다.",name,finalScore);
	}

}
