public class ConversorMoedas {
    static void main() {

        double valorReais = 451.50;
        double taxaCambio = 5.25;

        double valorConvertido = valorReais / taxaCambio;

        System.out.println("O valor em dólares é: US$ " + valorConvertido);

    }
}
