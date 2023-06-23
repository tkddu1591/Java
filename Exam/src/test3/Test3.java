package test3;
/*
 * 날짜: 2023/06/23
 * 이름: 김상엽
 * 내용: 자바 클래스 연습문제
 */

class Car{
	private String brand;
	private String name;
	private int price;
	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void dirve() {
		System.out.println(name+" 운행 중...");
	}

	public void info() {
		System.out.println("브랜드 : "+this.brand);
		System.out.println("차량명 : "+this.name);
		System.out.println("가    격 : "+this.price);
	}
}

public class Test3 {
	public static void main(String[] args) {
		Car sonata = null;
		Car bmw = null;
		sonata = new Car("현대","소나타",3000);
		bmw = new Car("BMW","520d", 5000);
		
		sonata.dirve();
		sonata.info();
	
		bmw.dirve();
		bmw.info();
	}
}
