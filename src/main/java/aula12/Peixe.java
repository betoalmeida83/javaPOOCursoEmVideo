package aula12;

public class Peixe extends Animal{

    private String corEscama;

    // CONSTRUCTOR

    public Peixe() {
    }

    public Peixe(String corEscama) {
        this.corEscama = corEscama;
    }

    // GETTERS AND SETTERS

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // METHODS

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");
    }

}
