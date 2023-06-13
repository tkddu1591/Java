package sub3;

import java.io.BufferedWriter;

/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: Ch02.Java 연산자 실습하기
 * 
 * 연산자(Operator)
 *  - 변수의 데이터를 처리하기 위한 연산식
 *  - 일반적으로 산술, 복합대입, 비교, 논리연산을 수행
 * 
 */
public class OperatorTest {

	public static void main(String[] args) {
		
		//단축키
		//ctrl+art+방향키 = 한줄복사
		//ctrl+d = 한줄삭제
		
		
		int num1 =1;
		int num2 =2;
		int num3 =3;
		int num4 =4;
		
		
		int result1= num1+num2;
		int result2= num1-num2;
		int result3= num3*num2;
		int result4= num4/num2;
		int result5= num4%num3;
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		System.out.println("result5 : "+result5);
		
		int num =0;
		num++;
		++num;
		System.out.println("num : "+num);

		num--;
		--num;
		System.out.println("num : "+num);
		
		int n1=1, n2=2,n3=3,n4=4;
		n1+=1;
		n2-=2;
		n3*=3;
		n4/=4;
		
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		System.out.println("n3 : "+n3);
		System.out.println("n4 : "+n4);
		
		int var1 =1;
		int var2 =2;
		
		Boolean rs1 = var1>var2;
		Boolean rs2 = var1<var2;
		Boolean rs3 = var1==var2;
		Boolean rs4 = var1!=var2;
		Boolean rs5 = var1>=var2;
		Boolean rs6 = var1<=var2;
		
		System.out.println("rs1 : "+rs1);
		System.out.println("rs2 : "+rs2);
		System.out.println("rs3 : "+rs3);
		System.out.println("rs4 : "+rs4);
		System.out.println("rs5 : "+rs5);
		System.out.println("rs6 : "+rs6);
		
		int var3 = 3;
		int var4 = 4;
		
		boolean res1 = var3>3&&var4>3;
		boolean res2 = var3>=3&&var4>3;
		boolean res3 = var3>3||var4>3;
		boolean res4 = var3>3||var4>5;
		boolean res5 = !(var3>var4);
		
		System.out.println("res1 = "+res1);
		System.out.println("res2 = "+res2);
		System.out.println("res3 = "+res3);
		System.out.println("res4 = "+res4);
		System.out.println("res5 = "+res5);
	}
}
