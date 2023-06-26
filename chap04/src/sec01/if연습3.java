package sec01;

import java.util.Scanner;

public class if연습3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하십시오");
		int num = sc.nextInt();
		sc.close();

		if (num % 2 == 0 && num % 5 == 0 && num != 0) {
			System.out.println("2와 5의 배수입니다.");
		} else {
			System.out.println("2와 5의 배수가 아닙니다.");
		}

		if (num % 2 == 0) {
			System.out.println(num + "는(은) 짝수입니다.");
		} else {
			System.out.println(num + "는(은) 홀수입니다.");
		}
	}

}
