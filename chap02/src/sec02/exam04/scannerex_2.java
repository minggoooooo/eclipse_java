package sec02.exam04;

import java.util.Scanner;

public class scannerex_2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1.Yes 2.No"); // ����ڿ��� 1 �Ǵ� 2�� �Է��� �����Ѵ�.
		
		int launcher = s.nextInt();
		
		if (launcher==1) {System.out.println("YES");
	}
		else if (launcher==2) {System.out.println("No");
		}
		else {System.out.println("�ùٸ� �Է°��� �ƴմϴ�. ���α׷��� �����մϴ�.");
		}
		}
}
