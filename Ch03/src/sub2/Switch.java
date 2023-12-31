package sub2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: Ch03. Switch 조건문 실습하기
 */
public class Switch {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("숫자 입력 : ");
		bw.flush();
		int number = Integer.parseInt(br.readLine());
		bw.write("입력한 숫자 : "+String.valueOf(number)+"\n");
		bw.flush();
		
		switch(number %2) {
		case 0:
			bw.write("짝수입니다.");
			break;
		case 1:
			bw.write("홀수입니다.");
			break;
		}
		bw.flush();
		bw.close();
		

	}

}
