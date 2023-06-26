package sec02.exam04;

import java.util.Scanner;

public class scannerex_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1.Yes 2.No"); // 사용자에게 1 또는 2의 입력을 유도한다.
		
		int launcher = s.nextInt();
		
		if (launcher==1) {System.out.println("YES");
	}
		else if (launcher==2) {System.out.println("No");
		}
		else {System.out.println("올바른 입력값이 아닙니다. 프로그램을 종료합니다.");
		}
		}
}
