package test1;
/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: 자바 자료형 연습문제
 */
public class Test9 {

	public static void main(String[] args) {
		
		int count =0;
		for(int i=1; i<=9; i++) {
			if(i<=5)
				count=i;
			else
				count=10-i;
			for(int j=1; j<=5-count;j++)
				System.out.print(" ");
			for(int j =1; j<=2*count-1; j++)
				System.out.print("*");
			
			System.out.print("\n");
		}

	}

}