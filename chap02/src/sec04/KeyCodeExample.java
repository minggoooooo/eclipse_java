package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		//throws Exception �� ���ܻ�Ȳ�� ȭ�鿡 �����
		
		int keyCode;
		/*
		 * keyCode =System.in.read(); System.out.println("Ű�ڵ� : " + keyCode); keyCode
		 * =System.in.read(); System.out.println("Ű�ڵ� : " + keyCode); keyCode
		 * =System.in.read();
		 *  System.out.println("Ű�ڵ� : " + keyCode);
		 */
		
		while(true) { //���� �ݸ�
			keyCode = System.in.read();
			System.out.println("Ű�ڵ� : " + keyCode);
		}
	}

}
