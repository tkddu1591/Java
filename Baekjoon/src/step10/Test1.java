package step10;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[2];
        numbers[0] = Integer.parseInt(br.readLine());
        numbers[1] = Integer.parseInt(br.readLine());

        bw.write(String.valueOf(numbers[0]*numbers[1]));
        bw.flush();
        bw.close();
    }
}
