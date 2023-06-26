package sec02.exam04;

import java.util.Scanner;


public class scannerex1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("음식을 선택해 주십시오.");

		String food = s.next();
		
		System.out.println("금액을 넣어주십시오.");

		int price = s.nextInt();

		System.out.println(food + "는 " + "거스름돈은 " + (10000-price) + "원 입니다.");
		//말이 안되긴 해도 하나만 더 만들자.
	}

}
