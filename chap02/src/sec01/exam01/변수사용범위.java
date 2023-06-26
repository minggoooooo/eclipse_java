package sec01.exam01;

public class 변수사용범위 {
	public static void main(String[] args) {
		String a = " "; // 공백
		String b; //null
		System.out.println(a);
		int v1 =15;
		if(v1>10) {
			int v2;
			v2= v1-10;
			int v3 = v1 + v2 + 5;
			System.out.println(v3);
		}
		if(v1<10) {
			int v2;
			v2= v1+10;
			int v3 = v1 + v2 - 5;
			System.out.println(v3);
		}
		int v4= 15;
		int v5= 0;
		if (v1>10) {
			v5 = v4-10;
		}
		int v6= v4 + v5 + 5;
		System.out.println(v6);
	}

}
