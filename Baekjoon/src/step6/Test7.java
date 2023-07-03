package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class Test7 {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		String word;
		int check = 0;
		Set<Character>  set = new HashSet<>();
		for(int i=0; i<num; i++){
			check++;
			set.clear();
			word = br.readLine();
			set.add(word.charAt(0));
			for(int j =1; j<word.length(); j++){
				if(set.contains(word.charAt(j))&&word.charAt(j-1)!=word.charAt(j)){
					check --;
					break;
				}
				set.add(word.charAt(j));
			}

		}
		bw.write(String.valueOf(check));
		bw.flush();
		bw.close();
	}

}

