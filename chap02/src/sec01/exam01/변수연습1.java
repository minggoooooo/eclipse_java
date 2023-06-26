package sec01.exam01;

import com.sun.jdi.PathSearchingVirtualMachine;

public class 변수연습1 {

	public static void main(String[] args) {
		// int a = 30, b= 20, c= a-b; 요것도 됨
		// int a; 선언문
		// a= 30; 대입문
		// int a= 30; 이거는 틀림 -> 이미 선언 했으므로 그냥 따로 만들었으면 O
		// int a= 30; 선언과 대입 모두 한번에 실행
		int a = 30;
		int b = 20;
		int c = a-b;
		System.out.println(c);
		
						
	}

}

