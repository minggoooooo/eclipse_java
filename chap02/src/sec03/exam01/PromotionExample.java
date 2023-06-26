package sec03.exam01;

public class PromotionExample {

	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);

		char charValue = '사';
		intValue = charValue;
		System.out.println("사의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		//강제 타입 변환 casting 캐스팅 연산자는 괄호. 
		 
	}

}
