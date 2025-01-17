package aula05;

public class ContaBanco {

    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    // Construtores
    public ContaBanco() {
        this.setSaldo(0.00);
        this.setStatus(false);
    }

    // Saída
    public void status() {
        System.out.println("------------------------");
        System.out.println("*Informações da conta*");
        System.out.println("Numero da conta: " + getNumConta());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Nome: " + getDono());
        System.out.printf("Saldo da conta: R$%.2f%n", this.saldo);
        if(!this.getStatus()) {
            System.out.println("Status da conta: FECHADA!");
        }
        else{
            System.out.println("Status da conta: ABERTA!");
        }

    }

    //Métodos Acessores e Modificadores
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    // Métodos
    public void abrirConta(String tipo) {

        this.setTipo(tipo);
        this.setStatus(true);

        if(tipo.equals("cc")) {
            this.setSaldo(50.00);
        }
        else if(tipo.equals("cp")) {
            this.setSaldo(150.00);
        }
        else {
            System.out.println("Tipo de conta inválida!");
        }
        System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta() {
        if(this.getSaldo() > 0.00) {
            System.out.println("Você tem saldo disponivel em conta! Para encerrar a conta é necessário sacar todo o saldo");
        }
        else if(this.getSaldo() < 0.00) {
            System.out.println("Você tem saldo negativo em conta! Para encerrar a conta é necessário depositar a quantia devida");
        }
        else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(double depositar){
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + depositar);
            System.out.printf("Depósito de R$%.2f", depositar);
            System.out.println(" realizado na conta de " + this.getDono());
        }
        else {
            System.out.println("Esta Conta se encontra FECHADA! Não é possível realizar o depósito");
        }

    }

    public void sacar(double sacar) {

        if(this.getStatus() && sacar <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - sacar);
            System.out.printf("Saque de R$%.2f", sacar);
            System.out.println(" realizado na conta de " + this.getDono());
        }
        else if(this.getStatus() && sacar > this.getSaldo()) {
            System.out.println(this.getSaldo());
            System.out.println("Saldo insuficiente");
        }
        else {
            System.out.println("Esta Conta se encontra FECHADA! Não é possível realizar o saque");
        }
    }

    public void pagarMensal() {

        double mensalidade = 0.00;

        if(this.getTipo().equals("cc")){
            mensalidade = 12.00;
        }

        else if(this.getTipo().equals("cp")) {
            mensalidade = 20.00;
        }

        if(this.getStatus() && this.getSaldo() >= mensalidade){
            this.setSaldo(getSaldo() - mensalidade);
            System.out.println("Mensalidade paga com sucesso!");
        }
        else if(this.getStatus() && this.getSaldo() <= mensalidade) {
            System.out.println("Saldo insuficiente");
        }
        else {
            System.out.println("Esta Conta se encontra FECHADA! Não é possível realizar o pagamento da Mensalidade");
        }

    }

}
