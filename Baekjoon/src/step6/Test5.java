package step6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Test5 {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		double[] credit=new double[20];
		String[] grade =new String[20];
		double gradedata = 0;
		double[] total = new double[21];
		double credittotal= 0;
		@SuppressWarnings("unused")
		String trash = null;
		
		for(int i =0; i<20; i++) {
			st = new StringTokenizer(br.readLine());
			trash =st.nextToken();
			credit[i]=Double.parseDouble(st.nextToken());
			grade[i]=st.nextToken();
			if(grade[i].equals("P")) {
				credit[i]=0;
				continue;
			}
			else if(grade[i].equals("A+"))
				gradedata=4.5;
			else if(grade[i].equals("A0"))
				gradedata=4.0;
			else if(grade[i].equals("B+"))
				gradedata=3.5;
			else if(grade[i].equals("B0"))
				gradedata=3.0;
			else if(grade[i].equals("C+"))
				gradedata=2.5;
			else if(grade[i].equals("C0"))
				gradedata=2;
			else if(grade[i].equals("D+"))
				gradedata=1.5;
			else if(grade[i].equals("D0"))
				gradedata=1.0;
			else if(grade[i].equals("F"))
				gradedata=0;
			
			credittotal+=credit[i];
			total[i]=gradedata*credit[i];
			total[20]+=total[i];
		}
		
		bw.write(String.valueOf(total[20]/credittotal));
		
		
		
		bw.flush();
		bw.close();
	}

}

