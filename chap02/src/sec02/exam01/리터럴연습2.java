package sec02.exam01;

public class 리터럴연습2 {

	public static void main(String[] args) {
		byte var1 = 115;
		byte var2 = 0;
		byte var3 = 127; //byte의 표기범위는 -128~ 127 그래서 byte var3= 128;은 안댐

		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		
		//bit < byte < short < int < long
		
		long var4 = 12345678;
		//long var5 = 1_000_000_000_000; int의 표시범위를 넘어가면 L을 입력해줘야함 var6처럼
		long var6 = 1_000_000_000_000L;
		System.out.println(var4);
		//System.out.println(var5);
		System.out.println(var6);
		//아스키코드 미국 표준화 코드 7비트 128개 문자 표현
		//작은 따옴표로 감싼 문자 리터럴은 유니코드로 변환
	}
	
	

}
