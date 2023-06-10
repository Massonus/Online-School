package checkIp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        Server server = new Server();
        server.createServer();
    }

    public void createServer() {
        try (ServerSocket serverSocket = new ServerSocket(57678);
             Socket socket = serverSocket.accept();
             Scanner scanner = new Scanner(socket.getInputStream());
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true)) {
            writer.write("Hello");
            writer.flush();

            final InetAddress localAddress = socket.getInetAddress();

            while (scanner.hasNext()) {
                final List<String> ipList = Service.getText("src/checkIp/blacklist.txt");

                ipList.forEach(ip -> {
                    if (ip.equals(localAddress.getHostAddress())) {
                        writer.write("Get away");
                        writer.flush();
                    } else {
                        writer.write("Welcome");
                        writer.flush();
                    }
                });
            }


        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
