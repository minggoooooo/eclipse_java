package sec01;

import java.util.Scanner;

public class if연습5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("구입 개수를 입력하십시오");
		int num = sc.nextInt();
		sc.close();
		
		if(num<8) {
			System.out.println("상품 수량:" + num);
			System.out.println("가격은 " + (num*7000) + "원 입니다.");
		} else {
			System.out.println("상품 수량:" + num);
			System.out.println("가격은 " + (int)(num*7000*0.9) + "원 입니다.");
		}
	}

}
