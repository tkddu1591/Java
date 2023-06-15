package sub4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 날짜: 2023/06/14
 * 이름: 김상엽
 * 내용: Ch03. While 반복문 실습하기
 */

public class WhileTest {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum=0, num = 0;
		bw.write("숫자를 입력하세요 : ");
		bw.flush();
		num = Integer.parseInt(br.readLine());
		int num2 = num;
		while(num2!=0) {
			sum+=num2;
			num2--;
		}
		bw.write("1부터 "+String.valueOf(num)+" 까지의 합 : "+String.valueOf(sum));
		bw.flush();
		sum=0;
		num2=num;
		do {
			if(num2%2==0)
				sum+=num2;
			num2--;
		}while(num2!=0);

		bw.write("\n1부터 "+String.valueOf(num)+" 까지의 짝수 합 : "+String.valueOf(sum));
		bw.flush();
		sum=1;
		num2=num;
		
		while(true) {
			if(sum%5 ==0&& sum%num2==0)
				break;
			sum++;
		}
		bw.write("\n5와 "+String.valueOf(num)+" 의 최소공배수 : "+String.valueOf(sum));
		bw.flush();
		sum=0;
		num2=num;
		int total=0;
		while(sum!=num2) {
			sum++;
			if(sum%2==1) {
				continue;
			}
			total += sum;
		}

		bw.write("\n1부터 "+String.valueOf(num)+" 까지의 짝수 합 : "+String.valueOf(total));
		bw.flush();
		bw.close();	
	
	}
}
