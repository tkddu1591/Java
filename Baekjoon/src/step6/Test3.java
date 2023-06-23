package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test3 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count =0;
		for(int i=1; i<=num*2-1; i++) {
			if(i<num)
				count=i;
			else
				count=num*2-i;
			for(int j=0; j<num-count;j++)
				System.out.print(" ");
			for(int j =0; j<2*count-1; j++)
				System.out.print("*");
			
			System.out.print("\n");
		}
		
		bw.flush();
		bw.close();
	}

}

