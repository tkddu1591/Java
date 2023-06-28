package test3;


/*
 * 날짜: 2023/06/23
 * 이름: 김상엽
 * 내용: 자바 클래스 연습문제
 */

public class Test1 {

	private String name;
	private int age;
	
	public Test1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void show() {
		System.out.println("-------------");
		System.out.println("이름 : "+this.name);
		System.out.println("나이 : "+this.age);
		System.out.println("-------------");
	}
	
	public static void main(String[] args) {
		Test1 kim = new Test1("김유신", 23);
		Test1 lee = new Test1("이순신", 31);
		kim.show();
		lee.show();
	}
}
