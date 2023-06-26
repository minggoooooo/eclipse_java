package sec03.exam01;

import java.util.Scanner;

public class PromotionExample4 {

	public static void main(String[] args) {
		// 자동 타입 변환
		Scanner s = new Scanner(System.in);
		System.out.println("출신학교를 입력하세요(3글자로 이루어진 문자열을 입력하시오): ");
		String word = s.next();

		char uni = word.charAt(2); // word.charAt(x) -> x안에 있는 숫자는 몇번 째부터 시작할 지를 정하는 것.
		// 근데 이상하게 다른 숫자 넣으면 안되네? 그 글자에서 몇번째인지 뜻하는것. 내가 여러글자 입력하면 됨
		// word 안에 있는 첫 글자가 0이 되는 것.
		// 결론은 charAt(x)는 문자열 즉 String 타입의 문자열의 x번째 문자를 char타입으로 변환하는 것.
		// toString(데이터) 데이터를 String 타입으로 변환.
		// charAt(숫자) 문자열의 숫자에 해당하는 문자를 캐릭터 타입으로 변환.
		// 중->51473
		// 고->44256
		// 대->45824

		int intValue = uni;
		
	
		
		/*if (intValue == 51473) { System.out.println("당신은 중학생입니다.");
		}else if (intValue == 44256){ System.out.println("당신은 고등학생입니다.");
		}else if (intValue == 45824) { System.out.println("당신은 대학생입니다.");
		}else {System.out.println("당신은 초등학생입니다.");
		}
		} 이거도 되고 밑에것도 됩니당~.
		intValue -> 중 고 대도 가능하고
		거기에 해당하는 유니코드도 가능.
*/	
		if (intValue == '중') { System.out.println("당신은 중학생입니다.");
		}else if (intValue == 44256){ System.out.println("당신은 고등학생입니다.");
		}else if (uni == '대') { System.out.println("당신은 대학생입니다.");
		}else {System.out.println("당신은 초등학생입니다.");
		}
		}
		

	}

