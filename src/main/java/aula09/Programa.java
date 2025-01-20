package aula09;

public class Programa {

    public static void main(String[] args) {

        Pessoa[] pessoa = new Pessoa[2];
        Livro[] livro = new Livro[3];

        pessoa[0] = new Pessoa("Roberto", 41, "Masculino");
        pessoa[1] = new Pessoa("Tatiana", 41, "Feminino");

        livro[0] = new Livro("1984", "George Orwell", 416, pessoa[0]);
        livro[1] = new Livro("Admirável Mundo Novo", "Aldous Huxley",312, pessoa[1]);
        livro[2] = new Livro("A Metamorfose", "Franz Kafka", 96, pessoa[0]);

        livro[2].abrir();
        //livro[2].fechar();
        livro[2].folhear(50);
        //livro[2].avancarPag();
        livro[2].voltarPag();
        System.out.println(livro[2].detalhes());

    }
}
