package test1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 날짜: 2023/06/14
 * 이름: 김상엽
 * 내용: 백준 10813 문제
 */

public class Test13 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> balls= new ArrayList<>();
		ArrayList<String> numbers= new ArrayList<>();
		ArrayList<String> numbers2= new ArrayList<>();
		
		int[] subs= new int[2];
		
		while(st.hasMoreTokens()) {
			numbers.add(st.nextToken());
		}
		for(int i=0; i<Integer.parseInt(numbers.get(0));i++) {
			balls.add(i+1);
		}
		for(int i=0; i<Integer.parseInt(numbers.get(1));i++) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int j = 0;
				numbers2.add(j, st.nextToken());
				j++;
			}
			subs[0] = balls.get(Integer.parseInt(numbers2.get(1))-1);
			subs[1] = balls.get(Integer.parseInt(numbers2.get(0))-1);
			balls.remove(Integer.parseInt(numbers2.get(0))-1);
			balls.remove(Integer.parseInt(numbers2.get(1))-1);
			balls.add(Integer.parseInt(numbers2.get(1))-1,subs[1]);
			balls.add(Integer.parseInt(numbers.get(0))-1,subs[0]);
		
		}
		for(int i=0; i<Integer.parseInt(numbers.get(0));i++) {
		bw.write(String.valueOf(balls.get(i))+" ");
		}
		bw.flush();
		bw.close();
	}
}
