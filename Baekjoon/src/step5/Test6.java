package step5;

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

		int number = Integer.parseInt(br.readLine());
		String numAlpa;
		StringTokenizer token;
		String ch;
		int num;
		String alpa;
		for(int i =0; i<number; i++) {
			numAlpa=br.readLine();
			token = new StringTokenizer(numAlpa);
			num = Integer.parseInt(token.nextToken());
			alpa = token.nextToken();
			for(int j =0; j<alpa.length(); j++) {
				for(int z=0; z<num;z++) {
					bw.write(alpa.substring(j,j+1));
				}
			}

			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}
}
