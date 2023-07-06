package step8;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat=Integer.parseInt(br.readLine());
        int num;
        int num2=2;
        for(int i=0; i<repeat; i++) {
            num = (int) ( Math.pow(2,i));
            num2 += num;
        }

        num2*=num2;
        bw.write(String.valueOf(num2));
        bw.flush();
        bw.close();

    }
}
