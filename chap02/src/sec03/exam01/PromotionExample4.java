package sec03.exam01;

import java.util.Scanner;

public class PromotionExample4 {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ
		Scanner s = new Scanner(System.in);
		System.out.println("����б��� �Է��ϼ���(3���ڷ� �̷���� ���ڿ��� �Է��Ͻÿ�): ");
		String word = s.next();

		char uni = word.charAt(2); // word.charAt(x) -> x�ȿ� �ִ� ���ڴ� ��� °���� ������ ���� ���ϴ� ��.
		// �ٵ� �̻��ϰ� �ٸ� ���� ������ �ȵǳ�? �� ���ڿ��� ���°���� ���ϴ°�. ���� �������� �Է��ϸ� ��
		// word �ȿ� �ִ� ù ���ڰ� 0�� �Ǵ� ��.
		// ����� charAt(x)�� ���ڿ� �� String Ÿ���� ���ڿ��� x��° ���ڸ� charŸ������ ��ȯ�ϴ� ��.
		// toString(������) �����͸� String Ÿ������ ��ȯ.
		// charAt(����) ���ڿ��� ���ڿ� �ش��ϴ� ���ڸ� ĳ���� Ÿ������ ��ȯ.
		// ��->51473
		// ��->44256
		// ��->45824

		int intValue = uni;
		
	
		
		/*if (intValue == 51473) { System.out.println("����� ���л��Դϴ�.");
		}else if (intValue == 44256){ System.out.println("����� ����л��Դϴ�.");
		}else if (intValue == 45824) { System.out.println("����� ���л��Դϴ�.");
		}else {System.out.println("����� �ʵ��л��Դϴ�.");
		}
		} �̰ŵ� �ǰ� �ؿ��͵� �˴ϴ�~.
		intValue -> �� �� �뵵 �����ϰ�
		�ű⿡ �ش��ϴ� �����ڵ嵵 ����.
*/	
		if (intValue == '��') { System.out.println("����� ���л��Դϴ�.");
		}else if (intValue == 44256){ System.out.println("����� ����л��Դϴ�.");
		}else if (uni == '��') { System.out.println("����� ���л��Դϴ�.");
		}else {System.out.println("����� �ʵ��л��Դϴ�.");
		}
		}
		

	}

