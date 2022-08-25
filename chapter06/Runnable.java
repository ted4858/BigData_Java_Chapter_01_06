package chapter06;

public class Runnable extends Object {
	
	public Runnable() {
		super();
	}
	
	public static void main() {
		//this(); // 자기자신의 생성자
		//super(); // Object 클래스 -> java의 최상위 클래스
		
		//(double)x / (double)y; 둘 중에 하나만 해도 되지만 둘 다 하는 것이 정석
		
		int[] values = {1, 2, 3};
//		int result1 = sum1(values);
//		int result2 = sum1(new int[] {1,2,3,4,5,});
		//int[] temporary = new int[] {1,2,3,4,5};
		
		while(true) {
			
		}
//		System.out.println("Hello"); //Unreachable code 앞의 while문 때문에 도달할 수 없는 코드
	}
	
}
