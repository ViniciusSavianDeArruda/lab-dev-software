/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Arquivo {

    private FileWriter arqW;
    private BufferedWriter escritor;

    private FileReader arqR;
    private BufferedReader leitor;

    private List<Livro> listaLivros;

    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaLivros = new ArrayList<>();
    }

    public List<Livro> lerArquivo() {

        listaLivros.clear();

        try {
            arqR = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqR);

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] campos = linha.split(";");

                String Titulo = campos[0];
                String Autor = campos[1];
                String AnoPubli = campos[2];
                String TipoLivro = campos[3];
                String Categoria = campos[4];
                String SituacaoLivro = campos[5];
         
                Livro livros = new Livro (Titulo,Autor,AnoPubli,TipoLivro,Categoria,SituacaoLivro);
                
                listaLivros.add(livros);
            }

            leitor.close();
            arqR.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaLivros;
    }
    
    public void gravarAquivo(){
        
        try {
            arqW = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqW);
            
            for(Livro alunos : listaLivros){
                
                escritor.write(
                alunos.getTitulo() + ";" +
                alunos.getAutor() + ";" +
                alunos.getAnoPubli() + ";" +
                alunos.getTipoLivro() + ";" +
                alunos.getCategoria() + ";" +
                alunos.getSituacaoLivro()
            );
                
                escritor.newLine();
            }
            
            escritor.close();
            arqW.close();
            
            System.out.println("Lista salva no arquivo");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void atualizarLivro(int index, Livro livros) {
    listaLivros.set(index, livros);
    }
    
    public void adicionarLivro(Livro livros) {
    listaLivros.add(livros);
   }
    
    
}
