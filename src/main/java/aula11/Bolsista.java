package aula11;

public class Bolsista extends Aluno{

    private double bolsa;

    // CONSTRUCTORS

    public Bolsista() {
    }

    public Bolsista(double bolsa) {
        this.bolsa = bolsa;
    }

    // GETTERS AND SETTERS

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    // METHODS

    public void renovarBolsa() {
        System.out.println("Renavando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado");
    }

}
