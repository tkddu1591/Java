package sub9;

public interface Car {
	//인터페이스에서는 속성(변수) 선언 X
	
	public abstract void SpeedUp(int speed);
	public abstract void SpeedDown(int speed);
	public void show(); //인터페이스 내의 메서드에서는 abstract 생략 가능
	
}
