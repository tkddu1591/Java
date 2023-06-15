package sub3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MethodTypeTest {
	
	
	public double type1(double x) {
		double y = x+3.14;
		return y;
	}
	
	public void type2(boolean status) {
		if(status)
			System.out.println("참 입니다.");
		else
			System.out.println("거짓 입니다.");
		
	}
	public boolean type3() {
		int num1 =1;
		int num2 =2;
		
		if(num1 >num2)
			return true;
		else
			return false;
	}
	public void type4() {
		MethodTypeTest mtt = new MethodTypeTest();
		mtt.type3();
	}
	
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		MethodTypeTest mtt=new MethodTypeTest();
		double r1 = Integer.parseInt(br.readLine());
		double r2 = Integer.parseInt(br.readLine());
		double r3 = mtt.type1(r1);
		bw.write(String.valueOf(r3));
		bw.flush();
		mtt.type2(true);
		mtt.type2(false);
		boolean r4= mtt.type3();
		bw.write(String.valueOf(r4));
		bw.flush();
		bw.close();
		mtt.type3();
		mtt.type4();
	}
	
}
