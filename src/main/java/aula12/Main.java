package aula12;

public class Main {

    public static void main(String[] args) {

        // Animal n = new Animal(); Animal é uma classe abstrata, portanto não pode ser instanciada
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Canguru canguru = new Canguru();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        GoldFish goldFish = new GoldFish();
        Arara arara = new Arara();

        canguru.locomover();
        cachorro.locomover();
        canguru.emitirSom();
        cachorro.emitirSom();


    }
}
