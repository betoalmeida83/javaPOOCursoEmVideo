package aula11;

public class Aula11 {

    public static void main(String[] args) {

        // Pessoa p1 = new Pessoa();
        /*
        Visitante v1 = new Visitante();
        v1.setNome("Roberto");
        v1.setIdade(41);
        v1.setSexo("M");
        System.out.println(v1);
        */

        Aluno a1 = new Aluno();
        a1.setNome("Murilo");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.setMatricula(27022009);
        a1.setCurso("Ensino Médio");

        System.out.println(a1);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Bernardo");
        b1.setMatricula(11022015);
        b1.setBolsa(12.5);
        b1.setSexo("M");
        b1.pagarMensalidade();


    }
}
