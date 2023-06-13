package test1;
/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: 자바 연산자 연습문제
 */
public class Test3 {

	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		
		result = num++;
		System.out.println("result : "+result);

		result = ++num;
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);

		result = --num;
		System.out.println("result : "+result);
	}

}