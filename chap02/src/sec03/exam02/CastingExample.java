package sec03.exam02;

public class CastingExample {

	public static void main(String[] args) {
		//int intValue = 46477;
		//byte byteValue = (byte)intValue;
		
		//System.out.println(byteValue);
		
		//int intValue = 44039;
		//char charValue = (char) intValue;
		//System.out.println(charValue);
		
		double doubleValue = 3.14;
		int intValue = (int) doubleValue;
		System.out.println(intValue); // 실수를 정수로 강제변환하면 소수점 이하는 버려진다.
		// + / * - %   %=나머지  예_ 5%2 ->1
	}

}
