package sec01;

import java.util.Scanner;


public class 확인문제3 {
	public static void main(String[] args) {
		// 1번 문제
		byte b = 5;
		b = (byte) -b; // byte에 음수 값은 없음.
		int result = 10 / b;
		System.out.println(result);

		// 2번 문제
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println(z); // 31

		// 4번 문제
		int pencils = 534;
		int students = 30;

		// 학생 1명이 가지는 연필 개수
		int pencilPerStudent = pencils / students;
		System.out.println(pencilPerStudent);

		// 남은 연필 개수
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);

		// 5번 문제
		int var1 = 5;
		int var2 = 2;
		double var3 = (double) var1 / var2; // 여기 답이 2가 나와서 안댐 앞에 더블 붙이면 5가 됩니당
		int var4 = (int) (var3 * var2);
		System.out.println(var4);

		// 6번 문제
		int value = 356; // 십의 자리 이하를 버리는 식은?
		System.out.println(value - (value % 100));

		// 8번문제
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (double) (lengthTop + lengthBottom) * height / 2;
		System.out.println(area);
		
		// 10번문제
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디: ");
		String name = sc.nextLine();
		
		//11번 문제
		System.out.println("패스워드: ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		sc.close();
		
		if(name.equals("java")) {
			if(password==12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패:패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패:아이디 존재하지 않음");
		}
		//12번 문제
		int a = 10;
		int c = 5;
		System.out.println((a>7) && (c<=5)); //true
		System.out.println((a%3 == 2) || (c%2 != 1)); //false
		
		//13번 문제
		int value1 = 0;
		value1+=10;
		System.out.println(value1);
		value1-=10;
		System.out.println(value1);
		value1*=10;
		System.out.println(value1);
		value1/=10;
		System.out.println(value1);

	}

}
