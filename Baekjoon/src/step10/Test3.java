package step10;

import java.io.*;
import java.util.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        int[] square = new int[2];
        for(int i=0; i<3; i++){
            st=new StringTokenizer(br.readLine());
            numbers1.add(Integer.parseInt(st.nextToken()));
            numbers2.add(Integer.parseInt(st.nextToken()));
        }
        if(Objects.equals(numbers1.get(0), numbers1.get(1))){
            square[0]= numbers1.get(2);
        }
        else if (Objects.equals(numbers1.get(0), numbers1.get(2))){
            square[0]=numbers1.get(1);
        }
        else
            square[0]=numbers1.get(0);

        if(Objects.equals(numbers2.get(0), numbers2.get(1))){
            square[1]= numbers2.get(2);
        }
        else if (Objects.equals(numbers2.get(0), numbers2.get(2))){
            square[1]=numbers2.get(1);
        }
        else
            square[1]=numbers2.get(0);
        bw.write(square[0]+" "+square[1]);
        bw.flush();
        bw.close();

    }
}
