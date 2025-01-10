package edu.lucaslowhan.exercicios.dominio;

public class Livro {
    private String titulo;
    private String dataPublicacao;
    private Autor autor;

    public Livro(String titulo, String dataPublicacao, Autor autor) {
        this.titulo = titulo;
        this.dataPublicacao = dataPublicacao;
        this.autor = autor;
    }
    public void imprimirDetalhes(){
        System.out.println("Titulo: " +this.titulo);
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Ano de publicação: " + this.dataPublicacao);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
