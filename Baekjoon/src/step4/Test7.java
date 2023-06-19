package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test7  {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> numbers = new ArrayList<String>();
		
		for(int i=0; i<30; i++)
			numbers.add(String.valueOf(i+1));
		
		for(int i =0; i<28; i++)
			numbers.remove(br.readLine());
		
		System.out.println(numbers.get(0)+"\n"+numbers.get(1));
			
		
	}

}
