package 지워;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("현재 시간을 입력하세요");

		int hour = sc.nextInt(); // 시간

		int minute = sc.nextInt(); // 분

		int addTime = sc.nextInt(); // 총시간을 분으로

		sc.close();

		int d = addTime / 60; // 더 할 시간 hour+ d가 24를 넘어간다면 결과값 - 24 해줘야해
		int e = addTime % 60; // 더 할 분
		
		hour = hour+d;
		minute = minute+e;
		if (minute >= 60) {
			minute= minute-60;
			hour = hour+1;
		}
		if(hour>=24) {
			hour = hour-24;
		}
		System.out.printf("%d %d",hour,minute);
	}
}

		/*if (0 <= hour | hour <= 23 && 0 <= minute | minute <= 59 && 0 <= addTime | addTime <= 1000) {
			if (hour + d >= 24 && minute + e >= 60) {
				System.out.print(hour + d - 23 + " ");
				System.out.print(minute + e - 60);
			} else if (hour + d >= 24 && minute + e < 60) {
				System.out.print(hour + d - 24 + " ");
				System.out.print(minute + e);
			} else if (hour + d == 23 && minute + e >= 60) {
				System.out.print(hour + d + 1 + " ");
				System.out.print(minute + e - 60);
			} else if (hour + d >= 24 && minute + e >= 60) {
				System.out.print( + " ");
				System.out.print(minute + e - 60);
			} else {
				System.out.print(hour + d + " ");
				System.out.print(minute + e);
			}

		}*/
		
	
