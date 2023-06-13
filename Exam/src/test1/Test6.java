package test1;

import java.util.Scanner;

/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: 자바 삼항연산자 연습문제
 */
public class Test6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		

		System.out.print("y값 입력 : ");
		int y = sc.nextInt();

		
		String result = x>y ? "x가 더 큽니다." : "y가 더 큽니다";
		System.out.println(result);
	}

}