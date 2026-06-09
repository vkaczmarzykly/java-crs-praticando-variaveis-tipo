public class VerificaIdade {
    static void main() {

        int idade = 12;
        String mensagem;

        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }

        System.out.println(mensagem);
    }
}
