package chapter06;

public class Calculator2 {
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
	public Calculator2() {
		Calculator2.pi = 3.14; // 정적변수는 this.이 아니라 클래스 이름으로 접근한다.
	}
}
