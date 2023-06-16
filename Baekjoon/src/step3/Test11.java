package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test11 {

	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[2];

		String s;
		while((s = br.readLine())!= null) {
			StringTokenizer st = new StringTokenizer(s);
			num[0]=Integer.parseInt( st.nextToken());
			num[1]=Integer.parseInt( st.nextToken());
			bw.write(String.valueOf(num[0]+num[1])+"\n");
		}

		
		
		bw.flush();
		bw.close();

	}

}
