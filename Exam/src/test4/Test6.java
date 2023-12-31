package test4;
/*
 * 날짜: 2023/06/30
 * 이름: 김상엽
 * 내용: Java API 클래스 연습문제
 */


class Apple {
	private String country;
	private int price;
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("원산지 : "+this.country);
		System.out.println("가격 : "+this.price);
	}
	
}
class Banana {
	private String country;
	private int price;
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("원산지 : "+this.country);
		System.out.println("가격 : "+this.price);
	}
	
}
class Grape extends Object {
	private String country;
	private int price;
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	public void show() {
		System.out.println("원산지 : "+this.country);
		System.out.println("가격 : "+this.price);
	}
	
}

public class Test6 {
	public static void main(String[] args) {
		Test6 test = new Test6();
		
		Apple apple= new Apple("한국", 3000);
		Banana banana = new Banana("필리핀", 2000);
		Grape grape = new Grape("미국", 1000);
		
		test.showInFo(apple);
		test.showInFo(banana);
		test.showInFo(grape);

	}
	
	public void showInFo(Object fruit) {
		if(fruit instanceof Apple) {
			Apple apple = (Apple) fruit;
			apple.show();
		}
		else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			banana.show();
		}
		else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			grape.show();
		}
		
		
	}
}
