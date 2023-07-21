package step10;

import java.io.*;
import java.util.*;

public class Test7 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<List<Integer>> angles = new ArrayList<>();
        while (true) {
            st= new StringTokenizer(br.readLine());
            List<Integer> angs = new ArrayList<>();
            int check = 0;
            while (st.hasMoreTokens()){
                int num = Integer.parseInt(st.nextToken());
                angs.add(num);
                if(num==0)
                    check++;
            }
            if(check>2)
                break;

            angles.add(angs);
        }
        for(List<Integer> angs : angles)
        {
            Collections.sort(angs);
            if (angs.get(0) +(angs.get(1))<= angs.get(2)) {
                bw.write("Invalid");
            } else if (Objects.equals(angs.get(0), angs.get(1)) && Objects.equals(angs.get(1), angs.get(2))) {
                bw.write("Equilateral");
            } else if (Objects.equals(angs.get(0), angs.get(1)) || Objects.equals(angs.get(0), angs.get(2)) || Objects.equals(angs.get(2), angs.get(1))) {
                bw.write("Isosceles");
            } else {
                bw.write("Scalene");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
}
