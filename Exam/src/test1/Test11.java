package test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/*
 * 날짜: 2023/06/13
 * 이름: 김상엽
 * 내용: 백준 1436
 */
public class Test11 {

	public static void main(String[] args)throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int count1=0;
		int count2 = 0;

		LinkedList<Integer> stack = new LinkedList<Integer>();
		int num=0;
		while(count2 == count) {
			while(num>0) {
				stack.push(num%10);
				num = num/10;
			}
			while((!stack.isEmpty())) {
				if(stack.pop()==6) 
					count1++;
				else
					count1=0;
				if(count1==3){
					count2++;
					break;
				}
			}
			num++;
		}
		
		
	}
}