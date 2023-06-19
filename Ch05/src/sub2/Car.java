package sub2;

public class Car {
	private String name;
	private String color;
	private int speed;
	
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	public void speedUp(int speed) {
		this.speed+= speed;
	}
	public void speedDown(int speed) {
		this.speed-= speed;
	}
	
	public void show() {
		System.out.println("차량명 : "+this.name);
		System.out.println("차량색 : "+this.color);
		System.out.println("현재속도 : "+this.speed);
	}
	
}
