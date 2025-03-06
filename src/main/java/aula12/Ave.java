package aula12;

public class Ave extends Animal{

    private String corPena;

    // CONSTRUCTOR

    public Ave() {
    }

    public Ave(String corPena) {
        this.corPena = corPena;
    }

    // GETTER AND SETTERS

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    // METHODS

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }

}
