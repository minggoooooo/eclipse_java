package sec02.exam04;

public class 실수연습1 {

	public static void main(String[] args) {
		// float var1=3.14; -> float 결과값 실수는 뒤에 f, F를 붙여야 함.
		float var2 = 3.14f;
		float var3 = 3.14F;
		double var4 = 3.14;
		
		float var5 = 0.1234567890123456789f;
		double var6 = 0.1234567890123456789;
		System.out.println(var5); //반올림 되어 결과가 나와유
		System.out.println(var6);
		
		double var7 = 3e6;
		float var8 = 3e6f;
		double var9 =2e-3;
		double var10 =237e-4;
		
		
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println(var10);

	}

}
