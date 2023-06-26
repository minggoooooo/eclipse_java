package sec02.exam04;

public class 논리타입연습 {
	public static void main(String[] args) {
		boolean stop = true; // -> false가 되면 시작합니다가 나와요~
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}

		int a = 3; // a==1 이라는건 a가 1일 때라는 말이랑 같음.
		if (a == 1) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		String b = "중지";
		if (b == "중지") { // 요거는 예제일 뿐 올바른 표기법이 아님.
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
	}

}
