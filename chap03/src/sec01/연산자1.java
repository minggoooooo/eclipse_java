package sec01;

public class 연산자1 {

	public static void main(String[] args) {
		int x= -100;
		int result1 = +x;
		int result2 = -x;
		
		System.out.println(result1);
		System.out.println(result2);
		
		byte a= 100;
		byte result5= (byte)-a;
		//byte result3= -a; byte에 -를 붙이면 int로 변경 됨
		int result4 = -a;
		System.out.println(result5);
	}

}
