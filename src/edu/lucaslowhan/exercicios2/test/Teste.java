package edu.lucaslowhan.exercicios2.test;

import edu.lucaslowhan.exercicios2.dominio.Aluno;
import edu.lucaslowhan.exercicios2.dominio.Curso;

public class Teste {
    public static void main(String[] args) {
        Curso curso = new Curso("Metodos Java");
        Curso curso2 = new Curso("Java avançado.");
        Curso curso3 = new Curso("Banco de dados");
        Curso[] cursosAluno = {curso,curso2};
        Curso[] cursosAluno2 = {curso, curso3};
        Aluno aluno = new Aluno("Lucas",cursosAluno);
        Aluno aluno2 = new Aluno("Normelia",cursosAluno2);
        curso.setAlunos(new Aluno[]{aluno,aluno2});
        curso2.setAlunos(new Aluno[]{aluno2});
        curso3.setAlunos(new Aluno[]{aluno});
        aluno.imprimirDetalhes();
        aluno2.imprimirDetalhes();
        curso.imprimirListaAluno();
        curso2.imprimirListaAluno();
        curso3.imprimirListaAluno();
    }

}
