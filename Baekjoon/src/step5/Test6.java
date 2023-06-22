package step5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Test6 {
	public static void main(String[] args)throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int arr[] = new int[26];
		char[] alpa = str.toCharArray();
		int mid;	
		int num=0;

		for(int i =0; i<26;i++) 
			arr[i]=-1;

		for(int i =0; i<str.length(); i++) {
			num= (int)alpa[i]-97;
			int min =-1;
			int max =27;

			if(arr[num]==-1) {

				while(min<max) {
					mid = (max+min)/2;

					if(num<mid) {
						max= mid;
					}

					else if(num>mid) {
						min= mid;
					}

					else {
						arr[num]=i;
						break;
					}

				}

			}
		}
		for(int i =0; i<26;i++) 
			bw.write(String.valueOf(arr[i]+" "));

		bw.flush();
		bw.close();
		
	}
}
