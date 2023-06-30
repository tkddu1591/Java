package test4;

import java.util.Scanner;

/*
 * 날짜: 2023/06/30
 * 이름: 김상엽
 * 내용: 예외처리 연습문제
 */

class NotFoundException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotFoundException(){
		super("해당하는 숫자를 찾을 수 없습니다.");
	}
}
public class Test2 {
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,8,10};
		Scanner sc = new Scanner(System.in);
		
		System.out.print("찾을 숫자 입력 : ");
		int find = sc.nextInt();
		
		try {
			SerialArray(find,arr);
			System.out.println("해당하는 숫자 찾음!!!");
		} catch (NotFoundException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		System.out.println("프로그램 정상 종료...");
		
	}

	public static void SerialArray(int find, int[] arr)throws NotFoundException {
		
		for(int i : arr) {
			if(i==find)
				return;
		}
		throw new NotFoundException();
	}
}
