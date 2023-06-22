package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test8 {
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		String number = br.readLine();
		st = new StringTokenizer(number);
		String num1[] =new String[2];
		String num2[] =new String[2];
		num1[0]=st.nextToken();
		num2[0]=st.nextToken();
		char[] alpa1 = num1[0].toCharArray();
		char[] alpa2 = num2[0].toCharArray();
		char temp1;
		char temp2;
		
		temp1 = alpa1[0];
		temp2 = alpa2[0];
		alpa1[0]=alpa1[2];
		alpa2[0]=alpa2[2];
		alpa1[2]=temp1;
		alpa2[2]=temp2;

		num1[1] = new String(alpa1);
		num2[1] = new String(alpa2);
		
		if(Integer.parseInt(num1[1])>Integer.parseInt(num2[1]))
			bw.write(num1[1]);
		else
			bw.write(num2[1]);
		
		bw.flush();
		bw.close();
		
	}
}
