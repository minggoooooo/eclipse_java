package test;

import java.util.Scanner;

public class ¿¹Á¦1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("µÎ °³ÀÇ ¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		if(a>b) {System.out.println("»¬¼À °á°ú : " + (a-b));
	} else {System.out.println("µ¡¼À °á°ú : "+ (a+b));
	}
	}

}
