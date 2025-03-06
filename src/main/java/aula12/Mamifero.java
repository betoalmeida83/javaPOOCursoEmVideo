package aula12;

public class Mamifero extends Animal {

    private String corPelo;

    // CONSTRUCTOS

    public Mamifero() {
    }

    public Mamifero(String corPelo) {
        this.corPelo = corPelo;
    }

    // GETTERS AND SETTERS


    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    // METHODS

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Mamífero");
    }

}
