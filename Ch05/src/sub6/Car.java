package sub6;

public class Car {
	protected String name;
	protected String color;
	protected int speed;
	public Car(String color, String name, int speed) {
		this.color = color;
		this.name = name;
		this.speed = speed;
	}
	
	public void speedUp(int speed) {
		this.speed+=speed;
	}
	public void speedDown(int speed) {
		this.speed-=speed;
	}
	public void show() {
		System.out.println("차량의 이름 : " +this.name);
		System.out.println("차량의 색상 : " +this.color);
		System.out.println("차량의 속도 : " +this.speed);
	}
}
