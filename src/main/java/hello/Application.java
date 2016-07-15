package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.net.Socket;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws IOException {

        String host = "127.0.0.1";
        int port = 3306;
        Socket clientSocket = new Socket(host, port);

        if (clientSocket.isConnected()) {
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
            System.out.println("Coooool");
        }


        SpringApplication.run(Application.class, args);
    }
}