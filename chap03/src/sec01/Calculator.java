package sec01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자 2개를 입력 하세요");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("연산자를 입력하세요");
		String c= sc.next();
		int temp;
		int result;
		double result2;
		if(b>a) {
			temp=a; //a가3 b가 5일때 temp는 3이 됐고
			a=b; // a는b b의 값인 a는 5가됐고
			b=temp;  //b는 temp의 값인 3이됨}
		}
		
		if(c.equals("+")){ 
		 result= a+b;
		 System.out.println("두 수의 합계는 : " + result + "입니다.");
		}
		if(c.equals("-")){ 
		 result= a-b;
		 System.out.println("두 수를 뺀값은 : " + result + "입니다.");
		}
		if(c.equals("*")){ 
		 result= a*b;
		 System.out.println("두 수의 곱은 : " + result + "입니다.");
		}
		if(c.equals("/")){ 
		 result2= a/b;
		 System.out.println("두 수를 나누면 : " + result2 + "입니다.");
		}
		
		
//		if(c.equals("+"))
//				{System.out.println(a+b);}
//		if(a>b&&c.equals("-")) {
//			System.out.println(a-b);
//		}
//		if(a<b&&c.equals("-")) {
//			System.out.println(b-a);
//		}
//		if(c.equals("*")) {
//			System.out.println(a*b);
//		}
//		if(a>b&&c.equals("/")) {
//			System.out.println((double)a/b);
//		}
//		if(a<b&&c.equals("/")) {
//			System.out.println((double)b/a);
//		}
	}

}
