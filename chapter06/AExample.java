package chapter06;

public class AExample {
	public static void main(String[] args) {
		A a = new A();
//		a.speed = 10;
		System.out.println(a.getSpeed());
		a.setSpeed(1000);
		a.setSpeed(-10);
		
		
	}
}
