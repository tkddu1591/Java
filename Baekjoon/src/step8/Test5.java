package step8;

import java.io.*;

public class Test5 {
    public static void main(String[] args) throws IOException {
        //1 7 19 37 61  6 12 18 24
        //6 * 1 3 6 10  2 3 4
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int floor = 0;
        int count = 0;
        if (num == 1) {
            bw.write(String.valueOf(num));
        } else {
            num -= 2;
            while (true) {
                floor++;
                count += floor;
                if (num / (6 * count) == 0)
                    break;
            }
            bw.write(String.valueOf(floor + 1));
        }
        bw.flush();
        bw.close();
    }
}
