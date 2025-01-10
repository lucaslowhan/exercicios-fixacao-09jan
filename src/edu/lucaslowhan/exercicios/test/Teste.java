package edu.lucaslowhan.exercicios.test;

import edu.lucaslowhan.exercicios.dominio.Autor;
import edu.lucaslowhan.exercicios.dominio.Livro;

public class Teste {
    public static void main(String[] args) {
        Autor autor = new Autor("Tiago Forte","xxx@xxx.xxx");
        Livro livro = new Livro("Criando um segundo cerebro", "2022",autor);
        Livro livro2 = new Livro("A casa de Lucas","2024",autor);
        Livro[] livros = {livro, livro2};
        autor.setLivros(livros);
        livro.imprimirDetalhes();
        autor.imprimirObras();

    }
}
