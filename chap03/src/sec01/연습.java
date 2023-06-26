package sec01;

import java.util.Scanner;

public class 연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x의 초기값을 입력해 주세요");
		int x = sc.nextInt();

		System.out.println("y의 초기값을 입력해 주세요");
		int y = sc.nextInt();

		System.out.println("증감 기호를 입력해 주세요");
		String a = sc.next();

		if (a.equals("+")) {
			++x;
		} else {
			--y;
		}
		System.out.printf("x: %d y: %d",x,y);
	}

}
