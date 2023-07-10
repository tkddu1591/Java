package step8;

import java.io.*;

public class Test6 {
    public static void main(String[] args) throws IOException {
        //1 2 4 7 11 16 22 -> 1 2 3 4 5 6
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double count = 1;
        double num = Integer.parseInt(br.readLine());
        double denominator = 1;
        while (count < num) {
            denominator++;
            count += denominator;
        }
        count -= denominator - 1;
        double molecule = 1;
        molecule += num % count;
        denominator -= num % count;
        if ((molecule + denominator) % 2 != 0)
            bw.write((Math.round(molecule)) + "/" + Math.round(denominator));
        else
            bw.write((Math.round(denominator)) + "/" + Math.round(molecule));

        bw.flush();
        bw.close();
    }
}
