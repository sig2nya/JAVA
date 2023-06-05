TCP를 사용한 C Application과 JAVA Application의 통신
===================================================
> 아래는 서버 애플리케이션이다. (C언어)
```c
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>
#include<string.h>
#include<sys/socket.h>
#include<netinet/in.h>

void handleClient(int clientSocket) {
        const char *message = "Hello, Client\n";
        write(clientSocket, message ,strlen(message));
        printf("Connection, Closed\n");
        close(clientSocket);
        return;
}

int main(){
        int serverSocket, clientSocket;
        struct sockaddr_in serverAddr, clientAddr;
        socklen_t addrLen;

        serverSocket = socket(AF_INET, SOCK_STREAM, 0);
        if (serverSocket < 0) {
                perror("Fail Create ServerSocket");
                exit(0);
        }

        serverAddr.sin_family = AF_INET;
        serverAddr.sin_addr.s_addr = INADDR_ANY;
        serverAddr.sin_port = htons(8888);

        if (bind(serverSocket, (struct sockaddr *) &serverAddr, sizeof(serverAddr))) {
                perror("Binding Error");
                exit(0);
        }

        if (listen(serverSocket, 5) < 0) {
                perror("Listen Error");
                exit(0);
        }

        printf("Waiting for Clients\n");

        while(1){
                addrLen = sizeof(clientAddr);
                clientSocket = accept(serverSocket, (struct sockaddr *) &clientAddr, &addrLen);
                if (clientSocket < 0) {
                        perror("Fail Accept");
                        exit(0);
                }

                pid_t pid = fork();
                if (pid == 0) {
                        handleClient(clientSocket);
                        exit(0);
                } else if (pid < 0) {
                        perror("Fork Error");
                        exit(0);
                }
                close(clientSocket);
        }

        close(serverSocket);
        return 0;
}
```

> 아래는 JAVA 애플리케이션이다.
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TCP_Client {
    public static void main(String[] args) {
        String serverIP = "127.0.0.1";
        int serverPort = 8888;

        try{
            Socket socket = new Socket(serverIP, serverPort);

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out.println("Hello, Server");

            String response = in.readLine();
            System.out.println("Server Response : " + response);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

결과
====
> tcp_process.c
<img width="448" alt="image" src="https://github.com/sig2nya/JAVA/assets/70207093/1eb3664d-51a7-421f-b107-e133089a06b9">

> JAVA Client Request
<img width="304" alt="image" src="https://github.com/sig2nya/JAVA/assets/70207093/6d5ba9b5-5cb0-4691-91e0-049e133134c6">

> Server Application Resposne & Accept
<img width="444" alt="image" src="https://github.com/sig2nya/JAVA/assets/70207093/fe1d08d8-8810-40cd-a8ae-603c550ee838">
