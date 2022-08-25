package chapter06;

public class A {

	private int speed;
	private int mileage;
	
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	
	public A() {
		this.speed = 0;
	}
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
		}
		this.speed = speed;
	}
	
}
