package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test2 {

	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int[] b = new int[a];
		for(int i = 0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			b[i] = Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());			
		}
		for(int i = 0; i<a; i++) {
			bw.write(String.valueOf(b[i])+"\n");
		}
		bw.flush();
		bw.close();

	}

}
