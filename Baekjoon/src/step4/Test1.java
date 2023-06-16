package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test1 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int num = Integer.parseInt(br.readLine());
		int[] list = new int[num];
		int count = 0;
		String s = br.readLine();
		st = new StringTokenizer(s);
		int number = Integer.parseInt(br.readLine());
		for(int i = 0; i<list.length; i++) {
			int j = Integer.parseInt(st.nextToken());
			if(number ==j)
				count++;
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
		
		
	}

}
