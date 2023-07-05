package step7;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[][] square = new int[100][100];
        StringTokenizer st;
        int count = Integer.parseInt(br.readLine());

        int row;
        int col;
        for (int i = 0; i < count; i++) {
            st = new StringTokenizer(br.readLine());
            row = Integer.parseInt(st.nextToken());
            col = Integer.parseInt(st.nextToken());

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    square[row + j][col + k] = 1;
                }
            }
        }
        List<List<Integer>> list = Arrays.stream(square)
                .map(tmp -> IntStream.of(tmp)
                        .boxed()
                        .collect(Collectors.toList()))
                .toList();
        List<Integer> list2 = list.stream().flatMap(Collection::stream).collect(Collectors.toList());
        count = (int) list2.stream().filter(a -> a == 1).count();


        System.out.println(count);
        bw.flush();
        bw.close();

    }
}
