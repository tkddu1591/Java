package sub5;

public class Sedan extends Car {

	private int cc;
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	public void speedTurbo() {
		this.speed += 20;
	}
	
	@Override
	public void show() {
		super.show();
		System.out.println("차량의 배기량 : " +this.cc);
		
	}
	

	
}
