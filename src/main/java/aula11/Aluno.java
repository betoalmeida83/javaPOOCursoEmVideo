package aula11;

import java.sql.SQLOutput;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    // CONSTRUCTORS

    public Aluno() {
    }

    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    // GETTERS AND SETTERS

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // METHODS

    public void pagarMensalidade() {
        System.out.println("Pagando a mensalidade do aluno " + this.getNome());
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", curso='" + curso + '\'' +
                "} " + super.toString();
    }
}
