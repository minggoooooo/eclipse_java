package sec02.exam04;

import java.util.Scanner;

public class 응용문제3 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
				System.out.println("건물은 몇층까지 있나요??");
				int a = s.nextInt();
						System.out.println("최대 건물 높이에 \"x \" m를 나누면 최대 거주 인원이 된다. x값을 입력하시오?");
						int b = s.nextInt();
								int div = a/b;
								int c= a*5;
								int d= c/3;
					System.out.println("입력하신 건물은 전체 " + c +"m 이고 최대거주인원은 " + d + "명입니다");			
	}

}
