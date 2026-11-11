package view;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        int porta = 12345;
        
        try (ServerSocket servidorSocket = new ServerSocket(porta)) {
            System.out.println("Servidor aguardando conexão na porta " + porta);
            
            while (true) {
                try {
                    // 1. Aceita a conexão sem o try-with-resources
                    Socket clienteSocket = servidorSocket.accept();
                    System.out.println("Conexão aceita de " + clienteSocket.getInetAddress());
                   
                    // 2. Cria e inicia a thread passando o socket
                    Thread threadCliente = new ThreadServer(clienteSocket);
                    threadCliente.start();
                  
                    System.out.println("Pessoa enviada ao cliente!");
                    
                } catch (IOException ex) {
                    System.out.println("Erro ao atender cliente: " + ex.getMessage());
                }
            }
        } catch (IOException ex) {
            System.out.println("Erro ao iniciar servidor: " + ex.getMessage());
        }
    }
}