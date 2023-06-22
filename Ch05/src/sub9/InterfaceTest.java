package sub9;
/*
 * 날짜: 2023/06/22
 * 이름: 김상엽
 * 내용: Ch05. Java 인터페이스(Interface) 실습하기
 * 
 * 인터페이스(Interface)
 *  - 클래스간의 공통된 표준 규격을 위한 설계 문법
 *  - 인터페이스를 활용해서 객체간 결합도를 완화하는 효과(다형성)
 *  - 부수적으로 다종상속 효과
 * 
 */
class Tv extends Computer implements Internet{

	@Override
	public void access() {
		surf();
	}
	public void powerOn() {
		booting();
	}
	
}
class Computer{
	public void booting() {
		System.out.println("시스템 부팅...");
	}
	public void surf() {
		System.out.println("인터넷 서핑...");
	}
}
interface Internet{
	public void access();
}


public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 활용 1 - 표준화된 클래스 설계와 다형성 활용
		Car sonata = new Sedan("소나타", "흰색", 0);
		Car bongo= new Truck("봉고", "남색", 0);
		sonata.SpeedUp(80);
		sonata.SpeedDown(20);
		sonata.show();
		
		bongo.SpeedUp(60);
		bongo.SpeedDown(20);
		bongo.show();
		
		//인터페이스 활용 2 - 결합도 완화
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		
		//인터페이스 활용 3 - 다중상속효과
		Tv smaterTv = new Tv();
		smaterTv.powerOn();
		smaterTv.access();
	}
}
