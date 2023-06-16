package step3;

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
		int a = Integer.parseInt(br.readLine());
		int[][] b = new int[a][3];
		for(int i = 0; i<a; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			b[i][0] =  Integer.parseInt(st.nextToken());
			b[i][1] =  Integer.parseInt(st.nextToken());
			b[i][2] =  b[i][0]+b[i][1];
		}
		for(int i = 0; i<a; i++) {
			bw.write("Case #"+(i+1)+": "+b[i][0]+" + "+b[i][1]+" = "+String.valueOf(b[i][2])+"\n");
		}
		bw.flush();
		bw.close();

	}

}
