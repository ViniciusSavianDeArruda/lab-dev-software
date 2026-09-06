/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastroalunos;

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

    private List<Aluno> listaAlunos;

    public String nomeArquivo;

    public Arquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        listaAlunos = new ArrayList<>();
    }

    public List<Aluno> lerArquivo() {

        listaAlunos.clear();

        try {
            arqR = new FileReader(nomeArquivo + ".txt");
            leitor = new BufferedReader(arqR);

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] campos = linha.split(";");

                String nome = campos[0];
                String sexo = campos[2];
                String dataNascimento = campos[1];
                String matricula = campos[3];
                String curso = campos[4];
                String cpf = campos[5];
                String rua = campos[6];
                String numero = campos[7];
                String bairro = campos[8];
                String cidade = campos[9];
                String estado = campos[10];
                String cep = campos[11];
                String telefone = campos[12];
         
                Aluno alunos = new Aluno(nome,dataNascimento,sexo,matricula,curso,cpf,rua,numero,bairro,cidade,estado,cep,telefone);
                
                listaAlunos.add(alunos);
            }

            leitor.close();
            arqR.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return listaAlunos;
    }
    
    public void gravarAquivo(){
        
        try {
            arqW = new FileWriter(nomeArquivo + ".txt", false);
            escritor = new BufferedWriter(arqW);
            
            for(Aluno alunos : listaAlunos){
                
                escritor.write(
                alunos.getNome() + ";" +
                alunos.getDataNascimento() + ";" +
                alunos.getSexo() + ";" +
                alunos.getMatricula() + ";" +
                alunos.getCurso() + ";" +
                alunos.getCpf() + ";" +
                alunos.getRua() + ";" +
                alunos.getNumero() + ";" +
                alunos.getBairro() + ";" +
                alunos.getCidade() + ";" +
                alunos.getEstado() + ";" +
                alunos.getCep() + ";" +
                alunos.getTelefone()
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
    
    public void removerAluno(int index) {
    listaAlunos.remove(index);
   }

    public void atualizarAluno(int index, Aluno alunos) {
    listaAlunos.set(index, alunos);
    }
    
    public void adicionarAluno(Aluno alunos) {
    listaAlunos.add(alunos);
   }
    
}