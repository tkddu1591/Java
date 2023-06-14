package sub1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 날짜: 2023/06/14
 * 이름: 김상엽
 * 내용: Ch04. 배열(arrays) 실습하기
 */
public class ArrayTest {
	public static void main(String[] args)throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int[] num = new int[5];
	
	for(int i=0; i<num.length; i++) {
		num[i] = i+1;
		bw.write(String.valueOf(num[i])+" ");
	}
	bw.write("\n");
	char[] arr2 = {'A','B','C'};
	String[] arr3= {"서울", "대전", "대구", "부산","광주"};
	for(char c: arr2) {
		bw.write(String.valueOf(c)+" ");	
	}
	bw.write("\n");
	
	for(String str: arr3) {
		bw.write(str+" ");	
	}
	bw.write("\n");
	bw.flush();

	int[] scores = {80,60,78,62,92};
	int total = 0;
	
	for(int sum:scores)
		total+=sum;

	bw.write(String.valueOf(total));
	bw.flush();
	
	int[][] arr2d = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
	
	for(int i=0; i<arr2d.length;i++) {
		for(int j =0; j<arr2d[0].length;j++) {
			bw.write(String.valueOf(arr2d[i][j]));
		}
	}
	bw.write("\n");
	bw.flush();
	int[][][] arr3d = {{{1,2,3},{4,5,6},{7,8,9}},{{10,11,12},{13,14,15},{16,17,18}},{{19,20,21},{22,23,24},{25,26,27}}};
	for(int i=0; i<arr3d.length;i++) {
		for(int j =0; j<arr3d[0].length;j++) {
			for(int k=0; k<arr3d[0][0].length; k++)
			 bw.write(String.valueOf(arr3d[i][j][k]));
		}
	}
	bw.write("\n");
	bw.flush();
	
	
	bw.close();
	
	}
}
