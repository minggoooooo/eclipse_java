package sec02.exam01;

public class ���ͷ�����2 {

	public static void main(String[] args) {
		byte var1 = 115;
		byte var2 = 0;
		byte var3 = 127; //byte�� ǥ������� -128~ 127 �׷��� byte var3= 128;�� �ȴ�

		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		//bit < byte < short < int < long
		
		long var4 = 12345678;
		//long var5 = 1_000_000_000_000; int�� ǥ�ù����� �Ѿ�� L�� �Է�������� var6ó��
		long var6 = 1_000_000_000_000L;
		System.out.println(var4);
		//System.out.println(var5);
		System.out.println(var6);
		//�ƽ�Ű�ڵ� �̱� ǥ��ȭ �ڵ� 7��Ʈ 128�� ���� ǥ��
		//���� ����ǥ�� ���� ���� ���ͷ��� �����ڵ�� ��ȯ
	}
	
	

}
