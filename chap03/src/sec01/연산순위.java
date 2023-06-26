package sec01;

import java.util.Scanner;

public class 연산순위 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = sc.nextInt();

		// 삼항 연산자를 사용하여 두 수의 합이 50이상이면 "통과" 아니면 "탈락"을 출력하기

		int sum = num1 + num2;
		String result = (sum >= 50) ? "통과" : "탈락";
		System.out.println(result);
		
	}

}
