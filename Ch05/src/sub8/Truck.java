package sub8;

public class Truck extends Car{
	private int capacity;
	public Truck(String name, String color, int speed,int capacity) {
		super(name, color, speed);
		this.capacity=capacity;
	}
	public void load(int capacity) {
		this.capacity += capacity;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("차량의 적재량 : "+this.capacity);
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed += speed;
	}


	@Override
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
}
