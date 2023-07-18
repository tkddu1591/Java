package step9;

import java.io.*;
import java.util.StringTokenizer;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = 0;
        int result = 0;

        int[] numbers = new int[2];
        numbers[0] = Integer.parseInt(st.nextToken());
        numbers[1] = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= numbers[0] / 2 + 1; i++) {
            if (numbers[0] % i == 0) {
                count++;
                result = i;

            }
            if (count == numbers[1])
                break;
        }
        if(count==numbers[1]-1){
            System.out.println(numbers[0]);
        }
        else if (count < numbers[1])
            System.out.println(0);
        else
            System.out.println(result);

    }
}
