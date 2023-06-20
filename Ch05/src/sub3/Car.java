package sub3;





public class Car {
	
	private String name;
	private String color;
	private int speed;
	//클래스 변수(정적 변수)
	public static int count;
	
	public Car(String color, String name, int speed) {
		this.color= color;
		this.name = name;
		this.speed = speed;
		count++;
	}
	//클래스 메서드(정적 메서드)
	public static int getCount() {
		return count;
	}
	
	public void speedUp(int speed) {
		this.speed+=speed;
	}
	public void speedDown(int speed) {
		this.speed-=speed;
	}
	
	public void show() {
		System.out.println("차랑의 이름 :"+name);
		System.out.println("차랑의 색상 :"+color);
		System.out.println("차랑의 속도 :"+speed);
	}

}
