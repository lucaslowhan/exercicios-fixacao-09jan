package edu.lucaslowhan.exercicios.dominio;

public class Autor {
    private String nome;
    private String email;
    private Livro[] livros;

    public Autor(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public Autor(String nome, String email, Livro[] livros) {
        this.nome = nome;
        this.email = email;
        this.livros = livros;
    }
    public void imprimirObras(){
        System.out.println("Autor: "+this.nome);
        System.out.println("Obras: ");
        for(Livro livro: livros){
            System.out.println("Livro: "+ livro.getTitulo() + "\nAno Publicação: " + livro.getDataPublicacao()+"\n*****");

        }
    }

    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
