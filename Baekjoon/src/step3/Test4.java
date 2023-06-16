package step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test4 {

	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total1 = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int cost, num;
		int total2 = 0;
		for(int i = 0; i<b; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			cost = Integer.parseInt(st.nextToken());
			num = Integer.parseInt(st.nextToken());
			total2+=cost*num;
		}
		
		if(total1==total2)
			bw.write("Yes");
		else
			bw.write("No");
			
		bw.flush();
		bw.close();

	}

}
