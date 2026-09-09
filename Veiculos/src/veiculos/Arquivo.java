
package veiculos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author manto
 */
public class Arquivo {
    public static void salvar(String marca, String modelo, String ano, String placa, String cor){
        try{
            FileWriter arquivo = new FileWriter("veiculos.txt", true);
            PrintWriter escrever = new PrintWriter(arquivo);
            
            escrever.println(
                    marca + "; " +
                    modelo + "; " + 
                    ano + "; " +
                    placa + "; " +
                    cor
            );
            escrever.close();
            arquivo.close();
        }catch (IOException erro){
            System.out.println("Erro ao salvar o arquivo");
        }
    }
    public static void salvarTabela(JTable tabela){
        try{
            FileWriter arquivo = new FileWriter("veiculos.txt");
            PrintWriter escrever = new PrintWriter(arquivo);
            
            for(int i =0; i<tabela.getRowCount(); i++){
                escrever.println(
                tabela.getValueAt(i, 0) + ";" +
                tabela.getValueAt(i, 1) + ";" +
                tabela.getValueAt(i, 2) + ";" +
                tabela.getValueAt(i, 3) + ";" +
                tabela.getValueAt(i, 4)
                );
            }
            escrever.close();
            arquivo.close();
        } catch (IOException erro){
            System.out.println("Erro ao salvar o arquivo");
        }
    }
    
    public static void carregarTabela(JTable tabela) {

        try {
            BufferedReader ler = new BufferedReader(
                    new FileReader("veiculos.txt"));

            DefaultTableModel modelo =
                    (DefaultTableModel) tabela.getModel();

            String linha;

            while ((linha = ler.readLine()) != null) {

                String[] dados = linha.split(";");

                modelo.addRow(dados);
            }

            ler.close();

        } catch (IOException erro) {
            System.out.println("Erro ao carregar o arquivo!");
        }
    }
}
