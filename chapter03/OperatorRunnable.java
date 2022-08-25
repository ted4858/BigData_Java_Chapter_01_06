package chapter03;

public class OperatorRunnable {
	public static void main(String[] args) {
		
		String hello_world = "Hello " + "World"; //연산자 오버로딩
		hello_world = hello_world.concat(" Karl");
		
		System.out.println(hello_world);
		
		boolean bool1 = 0 < 10 || 10 > 0; //expression
		boolean result = false && false;
//		++X, X++;
//		--Y, Y--;
		int x = 10;
		int y = 0;
		System.out.println(x); // 10
		y = x++; // updating
		System.out.println(y);
		x = x +1; // 원본이 수정
		//x = 11
//		++10; // 상수에는 사용 불가
//		10 = 10 + 1;
		
//		++x + x++;
		x++;
		++x;
		y = ++x + 10;
		y = x++ + 10;
		
		for (int i =0; i < 10; ++i)
		{
			
		}
		
		String str1 = "JDK" + new String("6.0");
		String str2 = "JDK" + 6.0;
		
		String result2 = "10.0" + "2.2"; // 10.0 + 2.2 = 12.2
		double value1 = Double.parseDouble("10.0") + Double.parseDouble("2.2");
		
		String str3 = "JDK" + String.valueOf(6.0); // "6.0"
		
		System.out.println(str1);
		
		
		String strvalue1 = "신용권";
		String strvalue2 = "신용권";
		String strvalue4 = "신용권";
		String strvalue5 = "신용권";
		String strvalue3 = new String("신용권");
		if(strvalue2.equals(strvalue3)) {
			
		}
		int result4 = 1 << 3;
		
		x += y;
		
		// 조건식 ? A : B
		
		if(x > 0) {
			System.out.println("Hello");
			System.out.println("Hello");
			System.out.println("Hello");
		}
		
	}
}
