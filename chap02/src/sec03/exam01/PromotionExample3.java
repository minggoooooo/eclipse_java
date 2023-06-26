package sec03.exam01;

import java.util.Scanner;

public class PromotionExample3 {

	public static void main(String[] args) {
		// 자동 타입 변환
		Scanner s = new Scanner(System.in);
		System.out.println("출신학교를 입력하세요");
		String schoolName = s.next();
		char school = schoolName.charAt(2);
		
		System.out.println("현재 몇학년 인가요?");
		
		int grade = s.nextInt();
		
		if (school == '초') { System.out.println("당신은 초등학교 " + grade + "학년입니다.");
		} else if (school == '중') { System.out.println("당신은 중학교 " + grade + "학년입니다.");
		} 
	 else if (school == '고') { System.out.println("당신은 고등학교 " + grade + "학년입니다.");
	} 

		


	}
}

