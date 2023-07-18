package step9;

import java.io.*;
import java.util.StringTokenizer;

public class Test1 {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] numbers = new int[2];
        while(true) {
            st = new StringTokenizer(br.readLine());
            numbers[0] = Integer.parseInt(st.nextToken());
            numbers[1] = Integer.parseInt(st.nextToken());

            if(numbers[0]>numbers[1]&&numbers[0]%numbers[1]==0){
                System.out.println("multiple");
                continue;
            }
            else if(numbers[1]>numbers[0]&&numbers[1]%numbers[0]==0){
                System.out.println("factor");
                continue;
            }

            else if(numbers[1] == 0 && numbers[0] == 0)
                break;
            System.out.println("neither");

        }

    }
}
