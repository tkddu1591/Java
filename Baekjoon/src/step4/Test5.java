package step4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test5 {
	
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] count = new int[2];
		count[0] = Integer.parseInt(st.nextToken());
		count[1] = Integer.parseInt(st.nextToken());
		
		int[] box = new int[count[0]];
		int roof = count[1];
		
		for(int i =0; i <roof; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int number = Integer.parseInt(st.nextToken());
			while(true) {
				if(start<=end)
					box[start-1] = number;
				else
					break;
				start++;
			}
		}
		for(int i=0; i<count[0]; i++) {
			bw.write(String.valueOf(box[i])+" ");
		}
		bw.flush();
		bw.close();
		
		
	}

}
