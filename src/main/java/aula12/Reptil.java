package aula12;

public class Reptil extends Animal {

    private String corEscama;

    // CONSTRUCTOS
    public Reptil() {
    }

    public Reptil(String corEscama) {
        this.corEscama = corEscama;
    }

    // GETTERS AND SETTERS


    public String getCorEscama() {
        return corEscama;
    }

    // METHODS

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de Réptil");
    }

}
