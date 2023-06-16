package step1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test10 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf( a*(b%10))+"\n");
		bw.write(String.valueOf( a*((b%100)/10))+"\n");
		bw.write(String.valueOf( a*(b/100))+"\n");
		bw.write(String.valueOf( a*b));
		bw.flush();
		bw.close();
			
		
	}

}
