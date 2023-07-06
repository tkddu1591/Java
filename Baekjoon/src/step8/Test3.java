package step8;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int dollar;
        int quarter;
        int dime;
        int nickel;
        int penny;

        for(int i =0; i<count; i++){
            dollar = Integer.parseInt(br.readLine());

            quarter=dollar/25;
            dollar=dollar%25;

            dime=dollar/10;
            dollar=dollar%10;

            nickel=dollar/5;
            penny=dollar%5;
            bw.write(quarter+" "+dime+" "+nickel+" "+penny+"\n");
        }
        bw.flush();
        bw.close();

    }
}

