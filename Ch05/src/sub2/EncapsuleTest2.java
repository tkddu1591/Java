package sub2;

import java.io.IOException;

/*
 * 날짜: 2023/06/19
 * 이름: 김상엽
 * 내용: Ch05. 캡슐화 실습하기
 * 
 * 캡슐화(정보은닉, Encapsulation)
 *  - 캡슐화는 객체의 속성을 외부에 참조하지 못하게 정보(속성)을 은닉하는 특성
 *  - 클래스의 속성(필드- 전역변수)는 반드시 private 선언을 통해 캡슐화
 *  - private 속성의 초기화를 위해 생성자(Constructor) 정의
 *  - 은닉된 정보의 안전한 사용을 위해 Getter, Setter 제공
 * 
 */
public class EncapsuleTest2  {
	
	public static void main(String[] args)throws IOException {
	
		Car sonata = new Car("소나타","흰색",10);
		sonata.setName("그랜져");
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
		
		Car avante = new Car("아반떼","검정",10);
		avante.setColor("남색");
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
		Account2 kb = new Account2("홍길동", "국민은행", "101-1123-1234", 100000, 0);
		kb.deposit(60000);
		kb.withdraw(20000);
		kb.show();
		
		Account2 wr = new Account2("강감찬", "우리은행", "102-4532-1234", 20000, 0);
		wr.deposit(100000);
		wr.withdraw(27900);
		wr.show();
		
	}

}
