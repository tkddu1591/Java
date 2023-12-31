package sub3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: Ch03. for 반복문 실습하기
 */

public class For {
	// 피라미드 별찍기
	void pramid(int a)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("입력된 숫자 길이 만큼의 피라미드 모양 생성\n");
		for(int i=0; i<a; i++) {
			for(int j =0; j<a-i; j++) 
				bw.write(" ");
			for(int k =0; k<i*2+1; k++) 
				bw.write("★");
			bw.write("\n");
			bw.flush();
		}
	}
	//삼각형 별찍기
	void triangle(int a)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


		bw.write("입력된 숫자 길이 만큼의 별 생성\n");
		for(int i=0; i<a;i++) {
			for(int j=0; j<=i;j++) {
				bw.write("★");
			}
			bw.write("\n");
			bw.flush();
		}
	}

	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		For fo= new For();
		
		bw.write("숫자 입력 : ");
		bw.flush();
		int sum=0;
		int num=Integer.parseInt(br.readLine());
		for(int i=1; i<=num;i++) {
			sum+=i;
		}
		bw.write("1부터 "+String.valueOf(num)+"까지의 합 : "+String.valueOf(sum));

		bw.flush();
		sum=0;
		for(int i=1; i<=num; i++) {
			if(i%2==0)
				sum+=i;
		}
		bw.write("\n1부터 "+String.valueOf(num)+"까지의 짝수 합 : "+String.valueOf(sum)+"\n");
		bw.flush();
		sum=0;
		for(int i=2; i<=num; i++) {
			for(int j=1; j<=num; j++) {
				sum=i*j;
				bw.write(String.valueOf(i)+" X "+String.valueOf(j)+" : "+String.valueOf(sum)+"\n");
			}
			bw.write("\n");
			bw.flush();
		}
		
		fo.triangle(num);
		fo.pramid(num);
		bw.close();

	}

}
