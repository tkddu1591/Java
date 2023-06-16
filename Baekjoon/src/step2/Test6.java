package step2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test6 {
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int gap = Integer.parseInt(br.readLine());
		
		
		int total = a*60+b+gap;
		if(total>24*60-1)
			total-=24*60;
		int hour = total/60;
		int min = total%60;
		
		bw.write(String.valueOf(hour)+" "+String.valueOf(min));
		bw.flush();
		bw.close();
	}

}
