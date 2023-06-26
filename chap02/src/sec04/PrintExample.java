package sec04;

public class PrintExample {

	public static void main(String[] args) {
		int value= 123; //d-> 정수 f -> 실수 s -> 문자열
		System.out.printf("상품의 가격:%d원\n" , value);
		System.out.printf("상품의 가격:%6d원\n" , value);
		int value2= 1234; //%xd ->x-변수값의 자리수 빼고 공백 \t 탭 \n 줄바꿈 \% %
		System.out.printf("상품의 가격:%d원\n" , value2);
		System.out.printf("상품의 가격:%6d원\n" , value2);
		System.out.printf("상품의 가격:%-6d원\n" , value2);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.3f\n",10,area);
		
		String name= "홍길동";
		String job= "의적";
		System.out.printf("%6d | %-10s | %10s\n",1,name,job);
	}

}
