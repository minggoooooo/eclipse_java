package sec01.exam01;

public class ��������ȯ {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		// temp��� ������ �����Ͽ� x���� ���Խ�Ŵ temp = 3; 
		x = y;
		// ���� x�� ���� y���� ���Խ�Ŵ x-> 5���� �ٲ�
		y = temp;
		// ���� y�� ���� temp ���� ���Խ�Ŵ y -> 3���� �ٲ�
		// �ش� ������ ���� x�� y�� ���� ��ü�ϴ� ������.
		
		System.out.println("x:" + x + ", y:" + y);

	}

}
