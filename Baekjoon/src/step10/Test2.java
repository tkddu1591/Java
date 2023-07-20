package step10;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        //0 = 가로, 1=세로
        int[] jung = new int[2];
        int[] square = new int[2];
        jung[0]= Integer.parseInt(st.nextToken());
        jung[1]= Integer.parseInt(st.nextToken());
        square[0]= Integer.parseInt(st.nextToken());
        square[1]= Integer.parseInt(st.nextToken());
        List<Integer> minNum = new ArrayList<>();

        minNum.add(Math.abs(jung[0]-square[0]));
        minNum.add(Math.abs(jung[1]-square[1]));
        minNum.add(jung[0]);
        minNum.add(jung[1]);
        int min= Collections.min(minNum);

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();

    }
}
