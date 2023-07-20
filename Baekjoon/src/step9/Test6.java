package step9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test6 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int checkNum = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[(int) (Math.sqrt(checkNum) + 1)];

        List<Integer> list = new ArrayList<>();

        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i < Math.sqrt(checkNum); i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= Math.sqrt(checkNum); j += i) {
                    isPrime[j] = true;
                }
            }
        }

        while (true) {
            boolean check = false;
            for (int i = 2; i <= Math.sqrt(checkNum); i++) {
                if (!isPrime[i] && checkNum % i == 0) {
                    list.add(i);
                    checkNum /= i;
                    check = true;
                    break;
                }
            }
            if(!check) {
                list.add(checkNum);
                break;
            }

        }
        if(checkNum!=1) {
            for (int num : list) {
                bw.write(num + "\n");

            }
        }
        bw.flush();
        bw.close();


    }
}
