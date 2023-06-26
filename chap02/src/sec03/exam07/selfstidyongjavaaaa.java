package sec03.exam07;

import java.util.Scanner;

public class selfstidyongjavaaaa {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("한글자를 입력하세요");
		String a = s.next();
		
		System.out.println("입력하신 글자의 유니코드는" + (int) a.charAt(0) + "입니다.");
	}

}
