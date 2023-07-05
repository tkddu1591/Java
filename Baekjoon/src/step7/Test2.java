package step7;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                numbers.add(Integer.parseInt(st.nextToken()));
            }
        }

        int max = numbers.stream()
                .mapToInt(num->num)
                .max()
                .orElse(0);
        int count = numbers.indexOf(max);
        int col = count%9+1;
        int row = count/9+1;
        bw.write(max+"\n"+row+" "+col);
        bw.flush();
        bw.close();

    }
}
