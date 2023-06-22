package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test9 {
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] arr= br.readLine().toCharArray();
		int number;
		int count=0;
		for(char i:arr) {
			number = (int)i-65;
			if(number<15)
				count+=number/3+3;
			else if(number<19)
				count+=8;
			else if(number<22)
				count+=9;
			else if(number<26)
				count+=10;
			
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		
	}
}
