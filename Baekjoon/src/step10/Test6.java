package step10;

import java.io.*;

public class Test6 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] angles = new int[3];
        for(int i=0; i<angles.length; i++){
            angles[i] = Integer.parseInt(br.readLine());
        }
        if(angles[0]+angles[1]+angles[2]!=180){
            bw.write("Error");
        }
        else if(angles[0]==angles[1]&&angles[1]==angles[2]){
            bw.write("Equilateral");
        }
        else if(angles[0]==angles[1]||angles[0]==angles[2]||angles[2]==angles[1]){
            bw.write("Isosceles");
        }
        else {
            bw.write("Scalene");
        }
        bw.flush();
        bw.close();


    }
}
