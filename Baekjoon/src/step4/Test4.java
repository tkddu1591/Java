package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test4 {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int numbers[] = new int[9];
		int count = 0;
		int max = 0;
		for(int i = 0; i<9; i++) {
			numbers[i]=Integer.parseInt(br.readLine());
			if(numbers[i]>max) {
				max= numbers[i];
				count=i+1;
			}
		}
		
		bw.write(String.valueOf(max)+" \n"+String.valueOf(count));
		bw.flush();
		bw.close();
		
		
	}

}