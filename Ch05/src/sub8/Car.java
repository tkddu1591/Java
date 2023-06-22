package sub8;



public abstract class Car {
	protected String name;
	protected String color;
	protected int speed;
	public Car(String color, String name, int speed) {
		this.color = color;
		this.name = name;
		this.speed = speed;
	}
	
	public abstract void speedUp(int speed);
	public abstract void speedDown(int speed);
	public void show() {
		System.out.println("차량의 이름 : " +this.name);
		System.out.println("차량의 색상 : " +this.color);
		System.out.println("차량의 속도 : " +this.speed);
	}
}
