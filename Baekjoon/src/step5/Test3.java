package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test3 {
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		String token;
		for(int i =0; i<num; i++) {
			token = br.readLine();
			String a = token.substring(0,1);
			String b = token.substring(token.length()-1,token.length());
			bw.write(a +b+"\n");
		}
		bw.flush();
		bw.close();

	}
}
