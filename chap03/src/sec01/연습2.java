package sec01;

import java.util.Scanner;

public class 연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("학생이 총 몇명입니까?");
		// int student = sc.nextInt();
		// System.out.println("연필은 총 몇개입니까?");
		// int pencil = sc.nextInt();

		// int a = pencil / student;
		// int b = pencil % student;
		// System.out.printf("학생 한 명당 %d개씩 연필을 가져가고 %d개가 남아요", a, b);

		System.out.println("총 학생 수는?");
		int x = sc.nextInt();
		System.out.println("한 줄에 몇명씩 앉나요?");
		int y = sc.nextInt();

		int a = x % y;
		int b = (int) (x / y);
		int c = y - a;
//		int result = (a == 0) ? b : b + 1; // result는 몫
//		int result2 = (a == 0) ? a : y - a; // result2는 나머지
//		System.out.printf("총 %d줄이고\n남은 좌석수는 %d개 입니다.", result, result2);
//		
		// a==0 a!=0로 나눠서
		// if문 작성해서 a==0때는 그냥 나눠주고 몫은 b 남는좌석수 a로해서 만들면 되고
		// else문으로 b+1 y-a 됨

		if (a == 0) {
			System.out.printf("총 %d줄이고\n남은 좌석수는 %d개 입니다.", b, a);

		} else {
			System.out.printf("총 %d줄이고 \n남은 좌석수는 %d개 입니다.", b + 1, c);
		}
	}
}
