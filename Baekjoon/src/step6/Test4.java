package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test4 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		char[] cr = st.toCharArray();
		boolean cheak =true;
		for(int i =0; i<cr.length/2; i++) {
			if((int)cr[i] == (int)cr[cr.length-i-1])
				continue;
			else {
				cheak=false;
				break;
			}
		}
		
		if(cheak ==true)
			bw.write("1");
		else
			bw.write("0");
		bw.flush();
		bw.close();
	}

}

