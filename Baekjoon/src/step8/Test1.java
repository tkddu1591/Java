package step8;

import java.io.*;
import java.util.StringTokenizer;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();
        int arithmetic = Integer.parseInt(st.nextToken());
        int total = 0;
        for(int i=0; i<str.length();i++){
            char num = str.substring(i,i+1).charAt(0);
            double pow = Math.pow(arithmetic, str.length() - i - 1);
            if((int)num < 65){
                total += pow *((int)num-48);
            }
            else{
                total += pow *((int)num-55);
            }
        }
        bw.write(String.valueOf(total));
        bw.flush();
        bw.close();

    }
}
