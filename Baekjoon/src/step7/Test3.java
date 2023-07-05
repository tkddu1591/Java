package step7;

import java.io.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] words = new String[5];

        int max = 0;
        for (int i = 0; i < words.length; i++) {
            words[i] = br.readLine();
            if(words[i].length()>max)
                max=words[i].length();
        }
        for (int j = 0; j < max; j++) {
            for (int i = 0; i < words.length; i++) {

                try {
                    bw.write(words[i].substring(j, j + 1));
                }catch (StringIndexOutOfBoundsException e){
                    continue;
                }
            }
        }

        bw.flush();
        bw.close();

    }
}
