package sec03.exam07;

import java.util.Scanner;


public class selfstudy6_20 {
	public static void main(String[] args) {
		//String str = String.valueOf(기본타입) Stirng to도 가능해요
		Scanner s=new Scanner(System.in);
		System.out.println("세글자 단어를 적으세요");
		String a = s.next();
		System.out.println("첫 음절의 유니코드는" + (int)a.charAt(0) + ", 두 번째 음절의 유니코드는" + 
		(int)a.charAt(1) + ", 마지막 음절의 유니코드는" + (int)a.charAt(2) +" 이다.");
		
		System.out.println("무작위 숫자 3가지를 적으세요(단, 정수 소수 정수 순으로)");
		int b = s.nextInt();
		float c = s.nextFloat();
		short d = s.nextShort();
		
		System.out.println("세 수를 곱할 것인지 나눌 것인지 표기하여라(*,/)");
		
		String e= s.next();
		
		if (e.equals("*")) {System.out.println(b*c*d);
		}else {System.out.println((b/c/d));
		}
	}

}
