package sub3;

import java.io.IOException;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        System.out.println("[Client]");
        try {
            Socket socket = new Socket("127.0.0.1",9001);
            Thread t1 = new ThreadSender(socket);

            Thread t2 = new ThreadReceiver(socket);

            t1.start();
            t2.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
