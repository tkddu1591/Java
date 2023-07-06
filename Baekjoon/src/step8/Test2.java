package step8;

import java.io.*;
import java.util.StringTokenizer;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int total = Integer.parseInt(st.nextToken());
        int arithmetic = Integer.parseInt(st.nextToken());
        int number;
        int count = 0;
        int check = 0;
        int pow;
        char abc;
        while (true) {
            count++;
            if (check > total || total / arithmetic == 0) {
                break;
            }
            check = (int) (Math.pow(arithmetic, count) * arithmetic);
        }


        for (int i = 0; i < count; i++) {
            pow = (int) (Math.pow(arithmetic, count - i - 1));
            number = total / pow;
            total -= number * pow;
            if (number < 10)
                bw.write(String.valueOf(number));
            else {
                abc = (char) (55 + number);
                bw.write(String.valueOf(abc));
            }
        }
        bw.flush();
        bw.close();

    }
}

