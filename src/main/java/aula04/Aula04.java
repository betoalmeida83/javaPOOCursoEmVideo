package aula04;

public class Aula04 {

    public static void main(String[] args) {

        Caneta caneta1 = new Caneta("Compactor", "Preta", 0.3f);
        //caneta1.setModelo("BIC cristal");
        //caneta1.setCor("Azul");
        //caneta1.setPonta(0.5f);
        //caneta1.ponta = 0.5f;
        caneta1.setCarga(80);
        //caneta1.tampada = true;
        //caneta1.tampar();
        caneta1.status();
        caneta1.rabiscar();
        System.out.println();
        Caneta caneta2 = new Caneta("BIC", "Verde", 0.7f);
        caneta2.status();

    }
}
