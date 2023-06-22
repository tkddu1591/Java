package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test2 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String s = br.readLine();
		st = new StringTokenizer(s);
		int num = Integer.parseInt(st.nextToken());
		int number = Integer.parseInt(st.nextToken());
		s = br.readLine();
		st = new StringTokenizer(s);
		for(int i = 0; i<num; i++) {
			int j = Integer.parseInt(st.nextToken());
			if(number >j)
				bw.write(String.valueOf(j)+ " ");
		}
		bw.flush();
		bw.close();
		
		
	}

}
