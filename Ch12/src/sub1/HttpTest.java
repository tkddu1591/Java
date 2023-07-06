package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos;
        BufferedReader br;

        try {
            URL url = new URL("https://google.com");
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            fos = new FileOutputStream("./Result.txt");

            String line;

            while ((line = br.readLine()) != null) {

                System.out.println(line);
                fos.write(line.getBytes());

            }

            br.close();
            fos.close();
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("프로그램 종료");
    }
}
