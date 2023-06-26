package sec01.exam01;

public class 변수값교환2 {
	//int a= 10; 전역 변수 -> 이 클래스 전부에서 사용 가능
	public static void main(String[] args) {
		int a = 10, b = 20, c = 30; // 메인 구문 안에서 정해진 변수는 지역변수.
		a = c - a;
		c = a + b + 10;
		b = c + a;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(a + b + c);
		// 왜 a,b,c는 안될까?
		/*
		 * 이클립스 주요 단축키 ctrl + d 한 줄 삭제 ctrl + alt + 아래화살표 한줄 밑으로 복사 alt + 아래화살표 밑으로 이동
		 * ctrl + shift + f 자동정렬 f11 프로그램 실행
		 */
	}

}
