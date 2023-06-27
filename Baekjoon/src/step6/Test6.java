package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test6 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st=br.readLine();
		String arr[] = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		for(String s : arr) {
			st =st.replaceAll(s,"a");
		}
		bw.write(String.valueOf(st.length()));
		bw.flush();
		bw.close();
	}

}
