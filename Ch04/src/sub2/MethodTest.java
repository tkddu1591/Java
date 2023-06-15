package sub2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜: 2023/06/14
 * 이름: 김상엽
 * 내용: Ch04. Method 실습하기
 */
public class MethodTest {
	int num=0;
	public int f(int x) {
		int y = 2*x+3;
		return y;
	}	
	public int sum(int start, int end) {
		int total = 0;
		for(int k=start; k<=end; k++) {
			total +=k;
		}
		return total;
	}
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		MethodTest mt = new MethodTest();
		int x = Integer.parseInt(br.readLine());
		int x2 = Integer.parseInt(br.readLine());
		int y = mt.f(x);
		int z = mt.sum(x, x2);
		bw.write(String.valueOf(y)+"\n");
		bw.write(String.valueOf(z));
		bw.flush();
		bw.close();
	}
	
}
