package aula06;

public class Programa {

    public static void main(String[] args) {

        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.ligar();
        controleRemoto.ligarMudo();
        controleRemoto.desligarMudo();
        controleRemoto.ligarMudo();
        controleRemoto.maisVolume();
        controleRemoto.menosVolume();
        controleRemoto.play();
        controleRemoto.pause();
        controleRemoto.fecharMenu();
        controleRemoto.desligar();
        controleRemoto.abrirMenu();

    }
}
