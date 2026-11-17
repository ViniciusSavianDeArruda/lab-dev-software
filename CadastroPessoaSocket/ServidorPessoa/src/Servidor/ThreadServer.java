
package servidor;

import beans.Pessoa;
import dao.PessoaDAO;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ThreadServer extends Thread {

    private Socket clienteSocket;

    public ThreadServer(Socket clienteSocket) {
        this.clienteSocket = clienteSocket;
    }

    @Override
    public void run() {

        try {
            ObjectOutputStream out = new ObjectOutputStream(clienteSocket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(clienteSocket.getInputStream());

            Pessoa pessoa = (Pessoa) in.readObject();

            PessoaDAO pdao = new PessoaDAO();

            String resultado = pdao.cadastrar(pessoa);

            out.writeObject(resultado);
            out.flush();

            in.close();
            out.close();
            clienteSocket.close();

        } catch (Exception e) {
            System.out.println("Erro ao lidar com o cliente: " + e.getMessage());

            try {
                clienteSocket.close();
            } catch (Exception ex) {
                System.out.println("Erro ao fechar conexão: " + ex.getMessage());
            }
        }
    }
}
