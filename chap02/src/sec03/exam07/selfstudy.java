package sec03.exam07;

import java.util.Scanner;



public class selfstudy {
	public static void main(String[] args) {
		
		int a = 100;
		String b = String.valueOf(a); //String.valueof(x) x에대한 값을 String, 즉 문자열로 바꿉니다.
		

		
		Scanner s=new Scanner(System.in);
		
		System.out.println("첫번째 과목 등급을 입력하세요");
		String c = s.next();
		
		if (c.equals("A")) {System.out.println("당신의 학점은 4.0입니다.");
		}else if (c.equals("B")) {System.out.println("당신의 학점은 3.0입니다.");
		}else if (c.equals("C")) {System.out.println("당신의 학점은 2.0입니다.");
		}else {System.out.println("재수강하세요"); //x.equals(?)를 잘 기억해둘것 String x에 관한 ?라는 값이 같으면 true 아니면 false를 불러옴
		
		}
		
		
		
		
				
				
		System.out.println(b+a);
	}

}
