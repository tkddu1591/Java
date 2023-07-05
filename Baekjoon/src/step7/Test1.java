package step7;

import java.io.*;
import java.util.StringTokenizer;

public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        String line;
        int[][] numbers = new int[num1][num2];
        for (int a = 0; a < 2; a++) {
            for (int i = 0; i < num1; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                for (int j = 0; j < num2; j++) {
                    numbers[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }
        for (int i=0; i<num1; i++){
            for(int j=0; j<num2; j++){
                bw.write(numbers[i][j] +" ");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
