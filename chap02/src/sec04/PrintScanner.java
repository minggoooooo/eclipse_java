package sec04;

import java.util.Scanner;

public class PrintScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요");
		
		String name = sc.next();
		
		System.out.println("나이를 입력하세요");
		
		int age = sc.nextInt();
		
		System.out.println("순번\t이름\t나이");
		System.out.printf("%-3d\t%s\t%3d\n", 1 , name, age);
	}

}
