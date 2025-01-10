package edu.lucaslowhan.exercicios2.dominio;

public class Curso {
    private String nomeCurso;
    private Aluno[] alunos;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public void imprimirListaAluno(){
        System.out.println("------------");
        System.out.println("Curso: "+this.nomeCurso);
        System.out.println("Alunos matriculados:");
        for(Aluno aluno: alunos){
            System.out.println(aluno.getNome());
        }
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
