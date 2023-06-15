package sub4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 날짜: 2023/06/14
 * 이름: 김상엽
 * 내용: Ch04. Method overload 실습하기
 */
public class MethodOverloadTest {
	public int plus(int a) {
		return a+a;
	}
	public int plus(int a, int b) {
		return a+b;
	}
	public double plus(double a, double b) {
		return a+b;
	}
	public String plus(String a, String b) {
		
		return a+b;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		MethodOverloadTest mt = new MethodOverloadTest();

		int a =mt.plus(1, 2);
		int b =mt.plus(1, 2);
		double c =mt.plus(1.111, 2.2222);
		String d = mt.plus("A", "CCC");
		bw.write(String.valueOf(a)+"\n");
		bw.write(String.valueOf(b)+"\n");
		bw.write(String.valueOf(c)+"\n");
		bw.write(d);
		bw.flush();
		bw.close();
		
	}
}
