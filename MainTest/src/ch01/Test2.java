package ch01;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Test2 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 4;
        for (int i = 0; i < a; i++) {
            for (int j = a; j > i + 1; j--)
                bw.write("☆");
            for (int j = 0; j < i * 2 + 1; j++)
                bw.write("★");
            for (int j = a; j > i + 1; j--)
                bw.write("☆");
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

}
