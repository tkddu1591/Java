package step10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Test5 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();

        for(int i=0; i<count; i++){
            st = new StringTokenizer(br.readLine());
            numbers1.add(Integer.valueOf(st.nextToken()));
            numbers2.add(Integer.valueOf(st.nextToken()));
        }

        int min1 = Collections.min(numbers1);
        int min2 = Collections.min(numbers2);
        int max1 = Collections.max(numbers1);
        int max2 = Collections.max(numbers2);
        max1 -=min1;
        max2 -=min2;
        int extent = max1*max2;
        bw.write(String.valueOf(extent));
        bw.flush();
        bw.close();


    }
}
