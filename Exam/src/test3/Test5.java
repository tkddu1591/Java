package test3;
/*
 * 날짜: 2023/06/23
 * 이름: 김상엽
 * 내용: 싱글톤 객체 연습문제
 */

class Vehicle{
	private String name;
	private int price;
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("=========");
		System.out.println("차량명 : "+this.name);
		System.out.println("가격 : "+this.price);
		System.out.println("---------");
	}
	
}

class CarFactory{
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	public static CarFactory getInsetence() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name,price);
	}
}




public class Test5 {


	public static void main(String[] args) {
		CarFactory factory =CarFactory.getInsetence();
		
		Vehicle avante = factory.createCar("아반떼", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
		
	}
}
