package step9;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> numbers = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list;
        int count = 0;
        while (true) {
            numbers.add(Integer.parseInt(br.readLine()));
            list = new ArrayList<>();
            if (numbers.get(count) == -1)
                break;
            for (int i = 1; i <= Math.sqrt(numbers.get(count)); i++) {
                if (numbers.get(count) % i == 0) {
                    list.add(i);
                    if (numbers.get(count) / i != i && i != 1)
                        list.add(numbers.get(count) / i);
                }

            }
            lists.add(list);

            count++;
        }
        for (List<Integer> arr : lists) {
            Collections.sort(arr);
        }
        int sum;
        for (int i = 0; i < lists.size(); i++) {
            sum=0;
            for (Integer integer : lists.get(i)) {
                sum += integer;
            }
            bw.write(numbers.get(i));
            if(sum==numbers.get(i)) {
                bw.write(" = ");
                for (int j = 0; j < lists.get(i).size(); j++) {
                    if (j != lists.get(i).size() - 1)
                        bw.write((lists.get(i).get(j)) + " + ");
                    else
                        bw.write(String.valueOf(lists.get(i).get(j)));
                    sum += lists.get(i).get(j);
                }
                bw.write("\n");
            }
            else
                bw.write(" is NOT perfect.\n");

        }
        bw.flush();
        bw.close();

    }
}
