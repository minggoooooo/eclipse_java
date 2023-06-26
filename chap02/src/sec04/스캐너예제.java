package sec04;

import java.util.Scanner;

public class 스캐너예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*
		 * System.out.println("도어락 비밀번호를 입력하세요.");
		 * 
		 * String a = sc.nextLine();
		 * 
		 * while(true) if(a.equals("1234")) { System.out.println("환영합니다."); break; }
		 * else {System.out.println("비밀번호가 틀립니다."); String b = sc.nextLine();
		 * if(b.equals("1234")) {System.out.println("환영합니다."); {break; }
		 * 
		 * } } 여기까지가 내가 만든거
		 */
		while(true) {
			System.out.println("도어락 비밀번호를 입력하세요");
			String password = sc.nextLine();
			if(password.equals("1234")) {
				System.out.println("환영합니다.");
				break;
			}
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}

}
