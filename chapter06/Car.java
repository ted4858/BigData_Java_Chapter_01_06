package chapter06;

public class Car {
//	private String company;
//	private String model;
//	private int max_speed;
//	// 사용자 생성자
//	public Car() {
//		System.out.println("사용자 생성자이다.");
//		this.company = "현대자동차";
//		this.model = "그랜저";
//		this.max_speed = 300;
//	}
//	// default 생성자 -> 안 만들어진다. (사용자 생성자가 있으면..)
//	public void show_result() {
//		return;
//	}
	
//	//필드
//	public String company = "현대자동차";
//	public String model = "그랜저";
//	public String color = "검정";
//	public int maxSpeed = 350;
//	public int speed;
	
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // false를 리터
		}
		System.out.println("gas가 있습니다.");
		return true; //true를 리턴
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춥니다.(gas잔량:" + gas + ")");
				return;
			}
		}
	}
}