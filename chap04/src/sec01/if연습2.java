package sec01;

import java.util.Scanner;

public class if연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("첫번째 숫자는?");
//		int num1 = sc.nextInt();
//		System.out.println("두번째 숫자는?");
//		int num2 = sc.nextInt();
//		sc.close();
//		
//		if(num1>num2) 
//			System.out.println("첫번째 숫자가 큽니다.");
//		if(num1<num2)
//			System.out.println("두번째 숫자가 큽니다.");
//		if(num1==num2)
//			System.out.println("두 숫자가 같습니다.");
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		
		if(score>=50) {
			System.out.println("합격입니다.");
		} else {
			System.out.println("재시험을 보세요.");
		}
	}

}