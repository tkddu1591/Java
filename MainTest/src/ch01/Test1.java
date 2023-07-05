package ch01;

import java.io.*;

public class Test1 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        for (int i = 0; i < a; i++) {
            for (int j = a; j > i + 1; j--)
                bw.write(" ");
            for (int j = 0; j < i + 1; j++)
                bw.write("*");
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

}
