package sec03.exam07;

import java.util.Scanner;

public class 예제620 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하십시오.");
		int a = s.nextInt();
		int b = (int)a/50000; //14장
		int c = a%50000; //48700
		int d = (int)c/10000; //4장
		int e = c%10000; //8700
		int f = (int)e/5000; // 1장
		int g = e%5000; // 3700
		int h = (int)g/1000;// 3장
		int i = g%1000; // 700
		int j = (int)i/500;// 1개
		int k = i%500;// 270
		int l = (int)k/100; //2개
		int m = k% 100; // 0
		int n = m/10;
		
		
		//748770원은 5만원권 14장 만원권 4장 5천원권 1장 천원권 3장 500원권 1개 100원권 2개다.
		
		System.out.println("입력하신 돈의 액수의 5만원권은 총 " + b +"장");
		System.out.println("1만원권은 총 " + d + "장 " );
		System.out.println("5천원 권은 총 " + f + "장 ");
		System.out.println("1천원 권은 총 "+ h + "장 ");	
		System.out.println("500원 동전은" + j +" 개 ");
		System.out.println("100원 동전은" + l +" 개 ");
		System.out.println("10원 동전은" + n + "개");
				
		
		//이렇게 해도 되고 
		//int money= s.nextInt();
		//System.out.println("오만원권 : " + money / 50000 + "개");
		//money = money % 50000;
		//System.out.println("만원권 : " + money / 10000 + "개");
		//money = money % 10000; .... 이렇게 쭉 이어가도 된다. 이게 낫다
	}

}
