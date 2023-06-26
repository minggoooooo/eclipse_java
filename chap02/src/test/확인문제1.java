package test;

import java.util.Scanner;

public class 확인문제1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름은?");
		String name = sc.next();
		System.out.println("당신의 나이는?");
		int age = sc.nextInt();
		System.out.println("당신의 휴대폰 번호 가운데 4자리는?");
		String middleNumber = sc.next();
		System.out.println("당신의 휴대폰 번호 끝 4자리는?");
		String lastNumber = sc.next();
		sc.close();
		
		System.out.println("이름 : "+ name);
		System.out.print("나이 : "+ age + "\n");
		System.out.printf("전화 : 010-%s-%s",middleNumber,lastNumber);
		
		//System.out.printf("이름: %s \n" + "나이: %d \n" + "전화: 010-%s-%s" ,name,age,middleNumber,lastNumber );

	}

}
