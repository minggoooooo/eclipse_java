package sec03.exam07;

import java.util.Scanner;

public class 문자열을기본타입으로변환 {

	public static void main(String[] args) {
		// 두 수를 입력받습니다. 단 next() 이용하여 문자열로 입력받음.
		// 입력받은 문자열을 Integer.parseInt 이용하여 숫자로 형변환하기.
		// 두 숫자의 합계 출력하는 예제.

		Scanner s = new Scanner(System.in);

		System.out.println("첫번째 숫자를 입력하세요.");

		String a = s.next();
		System.out.println("두번째 숫자를 입력하세요.");
		String b = s.next();

		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		//Integer.parseInt 문자열->숫자(int)
		//String.valueOf(타입값) 타입값->문자
		int e = c + d; //e를 넣어도 됨.
		System.out.println("두 수의 합계는 : " + (c + d) + "입니다.");

	}

}
