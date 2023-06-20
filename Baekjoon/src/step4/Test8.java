package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test8 {

	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int box = Integer.parseInt(st.nextToken());
		int roof = Integer.parseInt(st.nextToken());
		int[] boxes = new int[box];

		int start;
		int end;
		int temp;

		for(int i=0; i<boxes.length; i++) {
			boxes[i]= i+1;
		}

		for(int i =0; i<roof; i++) {
			st = new StringTokenizer(br.readLine());
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());

			if(end == start){
				continue;
			}
			
			else if(end-start==1) {
				temp = boxes[start-1];
				boxes[start-1] = boxes[end-1];
				boxes[end-1] = temp;
			}
			else {
				for(int j=0; j<=(end-start)/2; j++) {
					temp = boxes[start+j-1];
					boxes[j+start-1] = boxes[end-j-1];
					boxes[end-j-1] = temp;
				}
			}

		}
		for(int i=0; i<boxes.length; i++) {
			bw.write(String.valueOf(boxes[i])+" ");
		}
		bw.flush();
		bw.close();
	}
}
