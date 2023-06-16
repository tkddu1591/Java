package step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test6 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt( st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		bw.write(String.valueOf( a+b)+"\n");
		bw.write(String.valueOf( a-b)+"\n");
		bw.write(String.valueOf( a*b)+"\n");
		bw.write(String.valueOf( a/b)+"\n");
		bw.write(String.valueOf( a%b)+"\n");
		bw.flush();
		bw.close();
			
		
	}

}
