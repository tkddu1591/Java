package step10;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long num = 4 * Long.parseLong(br.readLine());

        bw.write(String.valueOf(num));
        bw.flush();
        bw.close();
    }
}
