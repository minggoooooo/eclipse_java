package sec01;

import java.util.Scanner;

public class if연습1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = sc.next();
		System.out.println("당신의 점수는?");
		int score = sc.nextInt();
		sc.close();
		
		if(score>=70) {
			System.out.println(name + "님은 합격입니다.");
		} else {
			System.out.println(name + "님은 불합격입니다.");
		}

	}

}
