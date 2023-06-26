package sec02.exam04;

public class 문자연습2 {

	public static void main(String[] args) {
		String name="장동건";
		String job="배우";
		System.out.println(name + "은 " + job + "입니다.");
		
		String str= "나는 \"자바\"를 좋아합니다.";
		System.out.println(str);
		
		String str2= "번호\t이름\t나이"; // \t-> 탭만큼 들여쓰기 기능
		
		System.out.println(str2);
				
		String str3= "번호\n이름\n나이"; // \n -> 한줄내림 기능
		System.out.println(str3);
		// 소문자e 또는 대문자 e가 포함되있으면 10진수 실수로 인식
		//5e2 -> 5.0 x 10의 2승 -> 500.0
		//0.12E-2 -> 0.12 X 10 -2승 ->0.0012
		
	}

}
