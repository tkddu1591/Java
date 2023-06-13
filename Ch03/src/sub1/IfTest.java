package sub1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: Ch03. if 조건문 실습하기
 */
public class IfTest {

	public static void main(String[] args)throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("두 개 숫자를 입력해 주세요\n첫번째 : ");
		bw.flush();
		int num1 =Integer.parseInt(br.readLine());
		bw.write("두번째 : ");
		bw.flush();
		int num2 =Integer.parseInt(br.readLine());
		if(num1 >num2)
			bw.write("첫번째가 큼");
		else if(num1==num2)
			bw.write("같음");
		else
			bw.write("두번째가 큼");
		bw.flush();
		bw.close();
		
	}

}
