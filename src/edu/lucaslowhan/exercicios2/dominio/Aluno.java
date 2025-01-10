package edu.lucaslowhan.exercicios2.dominio;

public class Aluno {
    private static int contador = 0;

    private String nome;
    private int matricula;
    private Curso[] cursos;

    public Aluno(String nome, Curso[] cursos) {
        this.nome = nome;
        this.matricula = ++contador;
        this.cursos = cursos;
    }
    public void imprimirDetalhes(){
        System.out.println("-----------------");
        System.out.println("Aluno: " + this.nome);
        System.out.println("Matricula: " +this.matricula);
        System.out.println("*** Cursos Matriculados ***");
        for(Curso curso:cursos){
            System.out.println(curso.getNomeCurso());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
}
