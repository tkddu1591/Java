package sub2;

import java.util.Scanner;

/**
 * 날짜: 2023/06/26
 * 이름: 김상엽
 * 내용: Ch06. Java Throws 실습하기
 */
public class ThrowsTest {
	
	public static void myMethod1(int n1) throws Exception {
		myMethod2(n1);
		
	}
	public static void myMethod2(int n1)throws Exception{

		try (Scanner sc = new Scanner(System.in)) {
			int n2 = sc.nextInt();
			int result = n1/n2;
			System.out.println("result : "+result);
		}
	}
	
	public static void main(String[] args) {
		try {
			myMethod1(1);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료...");
	}
	
}
