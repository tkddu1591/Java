package sub1;

import java.io.IOException;

/*
 * 날짜: 2023/06/19
 * 이름: 김상엽
 * 내용: Ch05. Class 실습하기
 * 
 * 클래스와 객체
 *  - 클래스는 객체를 생성하는 구조체이고 속성(필드, 멤버변수)과 기능(멤버, 메서드)으로 구성
 *  - 객체(object)는 클래스의 실제 인스턴스(Instance), new 연산으로 생성
 *  
 */
public class ClassTest {
	public static void main(String[] args) throws IOException {
		// 객체(Object 생성)
		Car sonata = new Car();
		
		//객체 초기화
		sonata.color = "흰색";
		sonata.name = "소나타";
		sonata.speed = 0;
		
		//객체 활용	
		sonata.speedUp(60);
		sonata.speedDown(20);
		sonata.show();
	
		//객체 선언, 생성, 초기화
		Car avante ;		//객체 선언
		avante = new Car();	//객체 생성
		
		avante.color = "검은색";
		avante.name = "아반떼";
		avante.speed = 0;
		
		avante.speedUp(80);
		avante.speedDown(20);
		avante.show();
		
		//Account 객체 생성
		
		Account kb = new Account();
		kb.balance =10000;
		kb.name = "김유신";
		kb.id = "101-21-0101";
		kb.setBank("국민은행");
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		Account wr = new Account();
		wr.balance = 10000;
		wr.name = "강감찬";
		wr.id =  "102-1002-0030";
		wr.setBank("우리은행");
		
		wr.deposit(20000);
		wr.withdraw(5000);
		wr.show();
		
	}
}
