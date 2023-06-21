package sub6;

public class Sedan extends Car{
	private int cc;
	public Sedan(String color, String name, int speed, int cc) {
		super(color, name, speed);
		this.cc =cc;
	}
	
	@Override
	public void speedUp(int speed) {
		this.speed+=speed+20;
	}
	public void speedTurbo() {
		this.speed+=20;
	}
	@Override
	public void show() {
		super.show();
		System.out.println("차량의 배기량 : "+cc);
	}

}
