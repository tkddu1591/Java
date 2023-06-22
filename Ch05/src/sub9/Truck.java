package sub9;

public class Truck implements Car{

	private String name;
	private String color;
	private int speed;
	
	public Truck(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public void SpeedUp(int speed) {
		this.speed +=speed;
	}

	@Override
	public void SpeedDown(int speed) {
		this.speed -=speed;
	}

	@Override
	public void show() {
		System.out.println("차량명 : "+name);
		System.out.println("차량색상 : "+color);
		System.out.println("차량속도 : "+speed);
	}

}
