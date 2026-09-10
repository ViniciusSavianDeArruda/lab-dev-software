/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prova;

/**
 *
 * @author laboratorio
 */
public class Livro {
    private String Titulo, Autor, AnoPubli, TipoLivro, Categoria, SituacaoLivro;

    public Livro(String Titulo, String Autor, String AnoPubli, String TipoLivro, String Categoria, String SituacaoLivro) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.AnoPubli = AnoPubli;
        this.TipoLivro = TipoLivro;
        this.Categoria = Categoria;
        this.SituacaoLivro = SituacaoLivro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getAnoPubli() {
        return AnoPubli;
    }

    public void setAnoPubli(String AnoPubli) {
        this.AnoPubli = AnoPubli;
    }

    public String getTipoLivro() {
        return TipoLivro;
    }

    public void setTipoLivro(String TipoLivro) {
        this.TipoLivro = TipoLivro;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getSituacaoLivro() {
        return SituacaoLivro;
    }

    public void setSituacaoLivro(String SituacaoLivro) {
        this.SituacaoLivro = SituacaoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" + "Titulo=" + Titulo + ", Autor=" + Autor + ", AnoPubli=" + AnoPubli + ", TipoLivro=" + TipoLivro + ", Categoria=" + Categoria + ", SituacaoLivro=" + SituacaoLivro + '}';
    }
    
    
}
