package sec03.exam07;

import java.util.function.DoubleToIntFunction;

public class Ȯ�ι���23_06_19�� {
	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = 10;
		double doubleValue = 5.7;
		String strValue = "A";
		char charValue = 'A';
		float floatValue = 2.5F;
		double doubleValue2 = 2.5;
		// short shortValue = charValue;
		// double doubleValue = byteValue;

		double var = (double) intValue;
		byte var1 = (byte) intValue;
		int var2 = (int) doubleValue;
		// char var3 = (char) strValue; ���ڿ��� ���°�� ĳ���ͷ� �ٲ����� �� ���߱� ����
		char var3 = strValue.charAt(0);
		System.out.println(var3);
		// byte result = byteValue + byteValue; �� ���� byte�� int�� �ٲٸ� �ذ� ��.
		float result = 5 + floatValue;
		double result2 = 5 + doubleValue2;
		System.out.println(result);

		char c1 = 'a';
		int c2 = c1 + 1;

		System.out.println((char) c2);

		int x = 5;
		int y = 2;
		double result3 = (double) x / y;
		System.out.println(result3);

		double var4 = 3.5;
		double var5 = 2.7;
		int result4 = (int) (var4 + var5);
		System.out.println(result4);

		long var6 = 2L;
		float var7 = 1.8f;
		double var8 = 2.5;
		String var9 = "3.9";
		double var10 = Double.parseDouble(var9);

		int result5 = ((int) var6 + (int) var7 + (int) (var8 + var10));

		int result6 = ((int) var6 + (int) (var7 + var8) + (int) var10);

		int result7 = (int) var6 + (int) var7 + (int) var8 + (int) var10;

		int result8 = (int) var6 + (int) var7 + (int) var8 + (int) Double.parseDouble(var9);

		int result9 = (int) (var6 + var7 + var8 + Double.parseDouble(var9));

		System.out.println(result5);
		System.out.println(result6);
		System.out.println(result7);
		System.out.println(result8);
		System.out.println(result9);
		
		String str1 = 2+3+"";// 5?
		String str2 = 2+""+3;// 23?
		String str3 = ""+2+3;// 23 String ������ ��ȯ ����.
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		byte value11 = Byte.parseByte("10");
		int value12 = Integer.parseInt("1000");
		float value13 = Float.parseFloat("20.5");
		double value14 = Double.parseDouble("3.14159");
		
	}

}
