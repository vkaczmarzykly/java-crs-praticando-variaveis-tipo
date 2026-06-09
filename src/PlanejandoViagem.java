public class PlanejandoViagem {
    static void main() {

        double consumoMedio = 12.5;
        double capacidadeTanque = 50;
        double quantidadeCombustivel = 10;
        double kmPlanejado = 90;

        double autoMaxima = consumoMedio * capacidadeTanque;
        double autoAtual = consumoMedio * quantidadeCombustivel;

        System.out.println("Autonomia máxima: " + autoMaxima);
        System.out.println("Autonomia atual: " + autoAtual);
        System.out.println("Distancia da viagem: " + kmPlanejado);

        if (kmPlanejado > autoMaxima) {
            System.out.println("Voce não conseguirá completar a viagem sem precisar absatecer");
        } else if (autoAtual >= kmPlanejado) {
            System.out.println("Voce conseguirá completar a viagem sem precisar absatecer");
        } else {
            System.out.println("Voce não conseguirá completar a viagem sem precisar absatecer");
        }

    }
}
