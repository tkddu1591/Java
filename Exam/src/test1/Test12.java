package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 날짜: 2023/06/14
 * 이름: 김상엽
 * 내용: 백준 2480 문제
 */

public class Test12 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] num =new int[3];
		int sum =0;

		int i =0;
		while(st.hasMoreTokens()) {
			num[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		Arrays.sort(num);
		
		if(num[0]==num[1]&&num[1]==num[2]) {
			sum = 10000+num[0]*1000;
		}
		else if(num[0]==num[1]) {
			sum = 1000+num[0]*100;
		}
		else if(num[1]==num[2]) {
			sum = 1000+num[1]*100;
		}
		else {
			sum=num[2]*100;
		}
		
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
	}
}
