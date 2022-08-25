package chapter06;

public class Activity {
	public static final String TAG = ".MainActivity";		//상수, 안드로이드 스튜디오에서 사용한 적 있음..
	public final static String TAG2 = ".MainActivity";		//상수, static final 거꾸로 해도 상관 없다.
	
	private final String name;
	public Activity() {
		this.name = "Karl";
	}
}
