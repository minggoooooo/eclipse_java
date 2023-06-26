package sec04;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		//throws Exception 은 예외상황을 화면에 출력함
		
		int keyCode;
		/*
		 * keyCode =System.in.read(); System.out.println("키코드 : " + keyCode); keyCode
		 * =System.in.read(); System.out.println("키코드 : " + keyCode); keyCode
		 * =System.in.read();
		 *  System.out.println("키코드 : " + keyCode);
		 */
		
		while(true) { //무한 반목문
			keyCode = System.in.read();
			System.out.println("키코드 : " + keyCode);
		}
	}

}
