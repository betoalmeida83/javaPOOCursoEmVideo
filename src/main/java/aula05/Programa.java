package aula05;

public class Programa {

    public static void main(String[] args) {

        ContaBanco contaBanco1 = new ContaBanco();

        contaBanco1.status();
        contaBanco1.abrirConta("cp");
        contaBanco1.setNumConta(11223344);
        contaBanco1.setDono("Roberto Almeida");
        contaBanco1.status();
        contaBanco1.depositar(300.00);
        contaBanco1.pagarMensal();
        contaBanco1.sacar(430.00);
        contaBanco1.fecharConta();
        contaBanco1.status();


        ContaBanco contaBanco2 = new ContaBanco();

        contaBanco2.status();
        contaBanco2.abrirConta("cc");
        contaBanco2.setNumConta(55667788);
        contaBanco2.setDono("Tatiana Sergio");
        contaBanco2.status();
        contaBanco2.depositar(500);
        contaBanco2.pagarMensal();
        contaBanco2.status();

    }
}
