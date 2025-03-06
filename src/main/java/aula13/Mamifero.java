package aula13;

public class Mamifero extends Animal{

    protected String corPelo;

    // CONTRUCTORS

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
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

}
