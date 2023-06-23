package test3;

/*
 * 날짜: 2023/06/23
 * 이름: 김상엽
 * 내용: 자바 클래스 생성자 연습문제
 */


class King {
	private String name;
	private int year;
	
	public King(int year) {
		this("정조");
		this.year = year;
	}

	public King(String name) {
		this.name= name;
	}

	public King(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public void show() {
		System.out.println("name : "+name);
		System.out.println("year : "+year);
	}

}

public class Test2{
	public static void main(String[] args) {
		King k1 = new King("태조",1392);
		King k2 = new King("세종대왕");
		King k3 = new King(1776);
		
		k1.show();
		k2.show();
		k3.show();
		
	}
}