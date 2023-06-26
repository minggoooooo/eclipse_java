package sec01;

import java.util.Scanner;

public class if연습4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어의 정답 개수는?");
		int score1 = sc.nextInt();
		System.out.println("영어의 정답 개수는?");
		int score2 = sc.nextInt();
		System.out.println("수학의 정답 개수는?");
		int score3 = sc.nextInt();
		sc.close();
		
		int sum = score1 + score2 + score3;
		
		if(score1<=6 || score2<=6 ||score3<=6 || sum <30) {
			System.out.println("불합격입니다.");
		} else {
				System.out.println("합격입니다.");
		}
		
	}

}
