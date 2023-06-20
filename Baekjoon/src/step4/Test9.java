package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Test9 {
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		ArrayList<Double> numbers = new ArrayList<Double>();
		
		for(int i =0; i <number; i++) 
			numbers.add(Double.parseDouble(st.nextToken()));
		
		Collections.sort(numbers,Collections.reverseOrder());
		Double max = numbers.get(0);
		double avg = 0;
		for(int i =0; i<number; i++) {
			numbers.set(i,numbers.get(i)/max*100);
			avg+=numbers.get(i);
		}
		avg/= number;
		bw.write(String.valueOf(avg));
		bw.flush();
		bw.close();
		
	}

}
