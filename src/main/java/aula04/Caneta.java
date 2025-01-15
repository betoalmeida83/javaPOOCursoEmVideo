package aula04;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta) {
        this.setModelo(modelo);
        this.setCor(cor);
        this.setPonta(ponta);
        this.destampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    protected int getCarga(){
        return this.carga;
    }

    protected void setCarga(int carga){
        this.carga = carga;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status() {
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.getPonta() + "mm");
        System.out.println("Carga: " + this.getCarga() + "%");
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Caneta TAMPADA, não é possível rabiscar!");
        }
        else {
            System.out.println("Estou Rabiscando!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

}
