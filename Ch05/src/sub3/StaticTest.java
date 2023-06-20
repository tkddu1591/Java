package sub3;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;

/*
 * 날짜: 2023/06/20
 * 이름: 김상엽
 * 내용: Ch05. Static(클래스 변수, 클래스 메서드) 실습하기
 * 
 * 클래스 변수, 클래스 메서드(정적변수, 정적메서드)
 *   - static을 선언한 변수, 메서드로 method Area에 생성
 *   - 별도의 객체생성 new를 하지 않고 클래스 타입으로 참조
 *   - 객체(인스턴스)들 간의 공유 목적으로 클래스변수와, 클래스메서드 사용
 *   
 *   
 * 싱글톤 객체(singleton)
 *   - static을 활용한 싱글톤객체는 오직 하나의 인스턴스로 메모리상에 존재
 *   - 싱글톤 객체를 사용해서 메모리 절약과 성능 향상을 기대
 */

class Increment{
	private int num1;
	public static int num2;
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
	}
}


public class StaticTest {
	public static void main(String[] args) {
		
		Car sonata = new Car("흰색", "소나타", 10);
		Car avante = new Car("검정", "아반떼", 20);
		Car grande = new Car("남색", "그랜저", 30);
		
		sonata.show();
		avante.show();
		grande.show();
		
		//클래스 변수 참조
		System.out.println("출고 차량 대수 : "+Car.count);

		//클래스 메서드 호출
		System.out.println("현재 차량수 : "+Car.getCount());
		
		Increment it1 = new Increment();
		Increment it2 = new Increment();
		Increment it3 = new Increment();
		
		//싱글톤 객체 실습
		Calc c1 = Calc.getInstance();
		Calc c2 = Calc.getInstance();
		
		int result1 = c1.plus(2, 3);
		int result2 = c2.minus(1, 2);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
	}
}
