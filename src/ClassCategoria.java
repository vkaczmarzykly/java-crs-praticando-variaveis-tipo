public class ClassCategoria {
    static void main() {

        double preco = 200.00;
        String categoria = "";

        if(preco <= 50.00) {
            categoria = "Econômico";
        } else if(preco > 50.00 && preco <= 200.00) {
            categoria = "Intermediário";
        } else {
            categoria = "Premium";
        }

        System.out.println("Categoria do produto: " + categoria);

    }
}
