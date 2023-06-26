package test;

import java.util.Scanner;

public class 확인문제3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = sc.next();
		System.out.print("2. 주민번호 앞 6자리: ");
		String birthDay = sc.next();
		System.out.print("3. 전화번호(-을 넣어주세요): ");
		String phoneNumber = sc.next();
		
		System.out.printf("%s님 주민번호는 %s이고 연락처는 %s입니다.",name,birthDay,phoneNumber);
		
		//출력은 printf 홍길동님 주민번호는 123456 이고 연락처는 010-1234-1234입니다.
	}

}
