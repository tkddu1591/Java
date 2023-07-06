package sub3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {
    public static void main(String[] args) {
        System.out.println("[Server]");
        try {
            ServerSocket serverSocket = new ServerSocket(9001);
            System.out.println("연결 대기...");
            Socket socket = serverSocket.accept();
            System.out.println("연결 수립...");

            Thread t1 =new ThreadSender(socket);
            Thread t2 =new ThreadReceiver(socket);
            t1.start();
            t2.start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
