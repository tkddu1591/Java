package sub6;

public class Truck extends Car{
	private int capacity;
	public Truck(String name, String color, int speed,int capacity) {
		super(name, color, speed);
		this.capacity=capacity;
	}
	@Override
	public void speedUp(int speed) {
		this.speed += speed-20;
	}
	public void load(int capacity) {
		this.capacity += capacity;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("차량의 적재량 : "+this.capacity);
	}
	
}
