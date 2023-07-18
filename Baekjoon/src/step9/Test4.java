package step9;

import java.io.*;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[2];
        numbers[0] = Integer.parseInt(br.readLine()); //min
        numbers[1] = Integer.parseInt(br.readLine()); //max
        boolean[] isPrime;
        isPrime = new boolean[numbers[1] + 1];
        isPrime[0] = isPrime[1] = true;
        for (int i = 2; i < Math.sqrt(numbers[1]); i++) {
            if (!isPrime[i]) {
                for (int j = i * i; j <= numbers[1]; j+=i) {
                    isPrime[j] = true;
                }
            }
        }
        int sum=0;
        int min=0;
        boolean check = false;
        for (int i = numbers[0]; i < isPrime.length; i++) {
            if (!isPrime[i]) {
                sum+=i;
                if(!check){
                    min=i;
                }
                check=true;
            }

        }
        if(min!=0) {
            bw.write(sum + "\n" + min);
        }
        else
            bw.write(-1+"");
        bw.flush();
        bw.close();
    }
}
