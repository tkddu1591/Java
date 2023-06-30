package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test8 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		st = st.toUpperCase();
		char[] cr = st.toCharArray();
		int numbers[]  = new int[26];
		for (int i =0 ;i<cr.length; i++) {
			numbers[(int)(cr[i])-65] ++;
		}
		
		int order = 0;
		int max = 0;
		
		for(int i=0; i<numbers.length;i++) {
			if(numbers[i]>max) {
				max=numbers[i];
				order=i;
			}
			else if(max==numbers[i])
				order=26;
		}
		char alpa;
		if(order!=26) {
			alpa = (char)(order+65);
			bw.write(String.valueOf(alpa));
		}
		else
			bw.write("?");	
		bw.flush();
		bw.close();
	}
}

