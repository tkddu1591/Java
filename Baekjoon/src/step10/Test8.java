package step10;

import java.io.*;
import java.util.*;

public class Test8 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> lenses = new ArrayList<>();

        lenses.add(Integer.parseInt(br.readLine()));
        lenses.add(Integer.parseInt(br.readLine()));
        lenses.add(Integer.parseInt(br.readLine()));

        int sum =0;
        Collections.sort(lenses);

        if(lenses.get(2)>=lenses.get(0)+lenses.get(1)){
            sum = lenses.get(2)*2-1;
        }
        else if (Objects.equals(lenses.get(0), lenses.get(2))){
            sum=lenses.get(0)*3;
        }

    }
}
