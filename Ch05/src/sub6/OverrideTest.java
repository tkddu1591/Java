package sub6;

/*
 * 날짜: 2023/06/21
 * 이름: 김상엽
 * 내용: Ch05. Java 오버라이드 실습하기
 * 
 * 오버라이드(메서드 재정의)
 *   - 부모클래스의 메서드를 자식클래스에서 재정의하는 문법
 *   - 오버라이드 기능을 통해서 객체지향 프로그래밍의 다형성 구현
 */
class AAA{
	public void method1() {
		System.out.println("AAA :method1...");
	}
	public void method2() {
		System.out.println("AAA :method2...");
	}
	public void method3() {
		System.out.println("AAA :method3...");
	}
}
class BBB extends AAA{
	@Override
	public void method2() {
		System.out.println("BBB :method2...");
	}
	public void method3(int a) {
		System.out.println("BBB :method3...");
	}
	
}
class CCC extends BBB{
	@Override
	public void method1() {
		System.out.println("CCC :method1...");
	}
	@Override
	public void method2() {
		System.out.println("CCC :method2...");
	}
	
	public void method3(int a, int b) {
		System.out.println("CCC :method3...");
	}
}

public class OverrideTest {
	public static void main(String[] args) {
		CCC c = new CCC();
		c.method1();
		c.method2();
		c.method3();
		c.method3(1);
		c.method3(1, 1);
		
		Sedan sonata = new Sedan("흰색", "소나타", 0, 2000);
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		
		sonata.speedUp(60);
		bongo.speedUp(60);
		sonata.show();
		bongo.show();
	}
}
