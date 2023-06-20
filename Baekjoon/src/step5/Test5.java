package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test5 {
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number = Integer.parseInt(br.readLine());
		String token = br.readLine();
		int sum=0;
		for(int i =0; i<number; i++) {
			sum+=Integer.parseInt(token.substring(i, i+1));
		}
		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();
		
	}
}
