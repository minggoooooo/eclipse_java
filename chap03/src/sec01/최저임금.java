package sec01;

import java.util.Scanner;

public class 최저임금 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("근로 시간을 입력하십시오");
		int workHour = sc.nextInt();
		sc.close();

		int result = (int) ((workHour >= 10) ? (workHour * 1.2 * 9620) : (workHour * 9620));

		System.out.println("총 임금은 " + result + "원 입니다.");

	}

}
