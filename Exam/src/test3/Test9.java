package test3;
/*
 * 날짜: 2023/06/23
 * 이름: 김상엽
 * 내용: 추상클래스, 다형성 상속 연습문제
 */
abstract class Shape{
	public abstract void draw();
}

class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Triangle");
	};
}

class Circle extends Shape{
	public void draw() {
		System.out.println("draw Circle");
	};
}

public class Test9 {

	public static void main(String[] args) {
		
		Test9 here = new Test9();
		
		Shape circle = new Circle();
		Shape triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}

	public void draw(Shape obj) {
		obj.draw();
	}
}
