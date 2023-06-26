package sec01;

import java.util.Scanner;

public class switch연습1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = sc.next();
		System.out.println("당신의 학년은?");
		int grade = sc.nextInt();
		sc.close();

		switch (grade) {
		case 1:
			System.out.println(name + "님은 1학년입니다.");
			break;
		case 2:
			System.out.println(name + "님은 2학년입니다.");
			break;
		default:
			System.out.println(name + "님은 3학년입니다.");
			break;
		}

	}

}
