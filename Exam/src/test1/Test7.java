package test1;
/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: 1~10 까지 정수 중 2의 배수와 3의 배수 정수의 합 구하기
 */
public class Test7 {

	public static void main(String[] args) {
		
		int total = 0;
		
		for (int i=1; i<=10; i++) {
			if(i%2==0||i%3==0)
				total+=i;
		}
	
	
		System.out.println("1 ~ 10까지 2와 3배수의 정수의 합 : "+total);
	}

}