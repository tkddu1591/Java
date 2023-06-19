package sub1;
/*
 * 날짜: 2023/06/19
 * 이름: 김상엽
 * 내용: Ch04. Class 실습하기
 */

//Car 클래스 정의
public class Car {
	
	//필드(속성) - 변수
	String name;
	String color;
	int speed;
	
	//메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량색 : "+ this.color);
		System.out.println("현재속도 : "+ this.speed);
		System.out.println("차량명 : "+ this.name);
	}	
}
