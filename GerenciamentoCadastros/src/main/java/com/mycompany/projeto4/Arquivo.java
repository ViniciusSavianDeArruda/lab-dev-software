/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projeto4;

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

    private List<Pessoa> listaPessoa;

    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaPessoa = new ArrayList<>();
    }

    public List<Pessoa> lerArquivo() {

        listaPessoa.clear();

        try {
            arqR = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqR);

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] campos = linha.split(";");

                String nome = campos[0];
                char sexo = campos[1].charAt(0);
                String idioma = campos[2];

                Pessoa p = new Pessoa(nome, sexo, idioma);

                listaPessoa.add(p);
            }

            leitor.close();
            arqR.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaPessoa;
    }
    
    public void gravarAquivo(){
        
        try {
            arqW = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqW);
            
            for(Pessoa p : listaPessoa){
                
                escritor.write(
                    p.nome + ";"+
                    p.sexo + ";"+
                    p.idioma
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
    
    public void removerPessoa(int index) {
    listaPessoa.remove(index);
   }

    public void atualizarPessoa(int index, Pessoa pessoa) {
    listaPessoa.set(index, pessoa);
    }
    
    public void adicionarPessoa(Pessoa pessoa) {
    listaPessoa.add(pessoa);
   }
    
}

