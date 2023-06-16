package step2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test4 {
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		
		if(a>0&&b>0)
			bw.write("1");
		else if(a<0&&b<0)
			bw.write("3");
		else if(a>0&&b<0)
			bw.write("4");
		else
			bw.write("2");
		bw.flush();
		bw.close();
	}

}
